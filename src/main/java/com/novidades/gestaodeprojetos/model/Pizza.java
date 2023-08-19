package com.novidades.gestaodeprojetos.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPizza")
    private Long id;

    private String descricao;

    @ManyToMany
    @JoinTable( // Tabela relacional, intermdiária entre as duas classes
            name = "pizza_ingrediente", // nome da "tabela de junção" ou "tabela pivot"
            joinColumns = @JoinColumn(name = "idPizza"), // lado da entidade dona do relacionamento
            inverseJoinColumns = @JoinColumn(name = "idIngrediente")) // lado da outra entidade que se relaciona com a
                                                                      // principal
    private List<Ingrediente> ingredientes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

}
