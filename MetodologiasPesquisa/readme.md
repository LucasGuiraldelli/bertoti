# Lucas Guiraldelli da Silva

## Introdução

Olá, seja bem-vindo. Sou o Lucas Guiraldelli, estudante de Banco de Dados pela FATEC Prof. Jessen Vidal. 

Tenho 19 anos e trabalho como estagiário em data science. 
<br>

![image](https://user-images.githubusercontent.com/64923139/197658220-a1e1a80a-8c97-44dc-9c65-589788f2841f.png)


# Projeto 3: 1º Semestre de 2022

### Parceiro acadêmico: MidAll

<details><summary>Logo da Empresa</summary>
<br><br>
<img src ="https://user-images.githubusercontent.com/80851038/163725778-498ec2e9-e8eb-45cf-a586-848e5bb1dd97.png"/></details>

<br>

## Objetivo do projeto:

Ferramenta para criar promoções de E-commerce, onde as mecânicas de promoções são feitas de forma flexível e de rápida atualização no sistema. As regras de promoções são cadastradas e posteriormente aplicadas no momento em que os itens são adicionados ao carrinho.

Atualmente implementamos e apresentamos o cadastro dos produtos dentro de promoções registradas dentro do servidor/banco de dados, utilizando operadores lógicos para criar diferentes mecânicas de promoções, os descontos são aplicados dentro da sacola de compras e possui uma visualização dedicada para conferência e escolha de promoções.

Além disso, há a autonomia fornecida ao usuário para editar, remover, arquivar ou desarquivar seus produtos e também para editar, deletar, interromper ou ativar promoções de uma visualização de maneira prática e intuitiva dos produtos e promoções cadastradas através da listagem que possui um filtro para que seja possível diferenciar quais os status de produtos e promoções.
<br><br>


### Tecnologias Utilizadas:

### `JQuery ` 
jQuery é uma biblioteca JavaScript criada por John Resig em 2006. É como um software de código aberto: seu uso é licenciado pela Massachusetts Institute of Technology (MIT) e pelo GNU General Public License (GPL). Sua principal finalidade é associar-se aos elementos JavaScript em HTML para conferir mais dinamismo e usabilidade às páginas na internet.

Suas linhas de código simplificam os scripts interpretados pelo navegador do client-side e por esse motivo é uma das bibliotecas mais populares na comunidade de desenvolvedores. Clique [aqui](https://jquery.com/) para acessar a documentação oficial.

### `Hibernate ` 

O Hibernate ORM permite que os desenvolvedores escrevam aplicativos com mais facilidade cujos dados sobrevivem ao processo do aplicativo. Como um framework Object/Relational Mapping (ORM), o Hibernate se preocupa com a persistência de dados quando se aplica a bancos de dados relacionais (via JDBC).
Além de sua própria API "nativa", o Hibernate também é uma implementação da especificação Java Persistence API (JPA). Como tal, pode ser facilmente usado em qualquer ambiente que suporte JPA, incluindo aplicativos Java SE, servidores de aplicativos Java EE, contêineres Enterprise OSGi, etc.


### `Quarkus ` 

As pilhas Java tradicionais foram projetadas para aplicativos monolíticos com longos tempos de inicialização e grandes requisitos de memória em um mundo onde a nuvem, os contêineres e o Kubernetes não existiam. Os frameworks Java precisavam evoluir para atender às necessidades desse novo mundo.

O Quarkus foi criado para permitir que desenvolvedores Java criem aplicativos para um mundo moderno e nativo da nuvem. Quarkus é uma estrutura Java nativa do Kubernetes adaptada para GraalVM e HotSpot, criada a partir das melhores bibliotecas e padrões Java. O objetivo é tornar o Java a plataforma líder em Kubernetes e ambientes sem servidor, oferecendo aos desenvolvedores uma estrutura para atender a uma ampla variedade de arquiteturas de aplicativos distribuídos.

<br>

### Contribuições Pessoais:
Durante o desevolvimento do projeto, tive principal atuação no Back-end. Neste campo fui responsável pela estruturação do banco de dados, desde a modelagem dos campos necessários no modelo MER (Modelo entidade Relacionamento) garantindo a organização das informações e a fácil acessibilidade para que a aplicação mantivesse a troca de dados sem falha. <br><br>
Para a implementação dessas estruturas foi necessário o aprendizado de uma nova tecnologia, o **Hibernate**. Que teve sua principal utilização na criação dos objetos do banco de dados a partir da aplicação.


<details><summary>Imagem Modelo Entidade Relacionamento (MER)</summary>

<br>

* Em engenharia de software, um **modelo entidade relacionamento** é um modelo de dados para descrever os dados ou aspectos de informação de um domínio de negócio ou seus requisitos de processo 

<br>

 <img   src="https://camo.githubusercontent.com/dba0f6bb157766615ecde9aa67a163f79aaefffefb5a19c82605401bce16e04c/68747470733a2f2f6d656469612e646973636f72646170702e6e65742f6174746163686d656e74732f3931333533343836363638363130333537332f3938323639333131343330373331333737342f6d6f64656c6167656d2e6a706567" width=/><br>
 <em>* imagem 3: Modelo Entidade Relacionamento (MER)</em>

<br>

**_Explicação do MER_:** Para a modelagem do banco utilizei a ferramenta brModelo para criar as entidades, atributos e definir seus relacionamentos. Onde foi definido que: Um produto pode fazer parte de vários carrinhos e um carrinho precisa receber pelo menos um ou vários produtos. Uma promoção pertence a apenas um produto, já um produto pode fazer parte de diversas promoções, ou seja, uma promoção não pode existir sem um produto. </details>

<br>

Durante o projeto também atuei na camada de troca de dados, utilizando JavaScript para:

<br>

 <ul>
  <li>cadastro de promoções;</li>
  <li>Definições de endpoints;</li>
  <li>Verificação de promoções cadastradas;</li>
  <li>Requisições HTTP.</li>
</ul>

<br>

Durante a segunda sprint tivemos que fazer uma reestruturação na equipe, onde tive participação fundamental na organização da equipe. Assumindo uma nova função como _PO (Product Owner)_ da equipe até a finalização do projeto, onde pude colocar em prática as ferramentas das metodologias ágeis aprendidas em aula, seguindo o SCRUM. 



