# relacionamentos-e-mapamentos-com-jpa

Neste repositório, você encontrará um projeto estruturado com diversos exemplos de mapeamentos 
e relacionamentos entre entidades utilizando a plataforma Java Persistence API (JPA). O projeto 
é composto por diferentes camadas, cada uma desempenhando um papel fundamental na construção de 
uma aplicação robusta e bem-organizada.

## Estrutura do Projeto:

1. **model**: Nesta pasta, você encontrará as classes de entidade que representam os objetos principais 
do sistema, como Evento, Categoria, Avaliacao, Pessoa, Pizza, Ingrediente e outras relevantes.

2. **repository**: Aqui estão as classes responsáveis por interagir diretamente com o banco de dados. 
Cada repositório encapsula operações de persistência e consulta relacionadas a uma determinada entidade.

3. **service**: As classes de serviço contêm a lógica de negócios da aplicação. Elas utilizam os repositórios 
para realizar operações no banco de dados e oferecem uma interface coesa para as camadas superiores.

4. **controller**: Nesta camada, estão os controladores que lidam com as requisições HTTP e interagem com 
os serviços para fornecer respostas adequadas. Os controladores são essenciais para a exposição das 
funcionalidades do sistema através de APIs REST.

## Testes e Exemplos:

O projeto também inclui arquivos HTTP que podem ser utilizados como testes através da extensão REST 
client do Visual Studio Code. Esses arquivos facilitam a execução de requisições HTTP e a observação 
das respostas, auxiliando no desenvolvimento e na depuração da aplicação.

## Tipos de Relacionamentos:

No projeto, exploramos diversos tipos de relacionamentos entre entidades:

* _@OneToOne_: Relacionamento um para um.
* _@OneToMany_: Relacionamento um para muitos.
* _@ManyToOne_: Relacionamento muitos para um.
* _@ManyToMany_: Relacionamento muitos para muitos.

## Mapeamentos Unidirecionais e Bidirecionais:

É importante entender a diferença entre mapeamentos unidirecionais e bidirecionais:

* Unidirecional: A navegação ocorre em uma única direção, de uma entidade para outra. É possível ir de A para B, mas não de B para A.
* Bidirecional: Permite a navegação em ambas as direções, de A para B e de B para A.

## Exemplos de Mapeamento:

* Mapeamento **@ManyToOne** unidirecional: Um evento pertence a uma categoria. Um evento pode estar associado a apenas uma categoria.
* Mapeamento **@OneToMany** unidirecional: Uma categoria possui vários eventos. Uma categoria pode estar associada a vários eventos.
* Mapeamento **@ManyToOne** e **@OneToMany** bidirecionais: Estabelece uma relação entre Evento e Categoria, permitindo a navegação em 
ambas as direções.
* Mapeamento **@OneToOne**: Um avaliação pertence a uma pessoa e uma pessoa pode ter apenas uma avaliação.
* Mapeamento **@ManyToMany**: Relacionamento entre Pizzas e Ingredientes, permitindo que uma pizza tenha vários ingredientes e um 
ingrediente esteja em várias pizzas.

## Observações Finais:

Este projeto serve como um guia prático para entender e implementar mapeamentos e relacionamentos de entidades usando JPA. 
A estrutura organizada em camadas, os exemplos de código e os testes HTTP fornecem uma base sólida para o desenvolvimento 
de aplicações que envolvam complexos modelos de dados e interações entre entidades. Use este repositório como referência 
para aprimorar suas habilidades em desenvolvimento Java e aproveitar ao máximo o potencial da Java Persistence API. 

Conteúdo baseado no curso de Backend do professor Weberson Rodrigues na Udemy.
