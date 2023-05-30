# Lucas Guiraldelli da Silva

## Introdução

Olá, seja bem-vindo. Sou o Lucas Guiraldelli, estudante de Banco de Dados pela FATEC Prof. Jessen Vidal. 

Tenho 19 anos e trabalho como Cientista de Dados. 
<br>

![image](https://user-images.githubusercontent.com/64923139/197658220-a1e1a80a-8c97-44dc-9c65-589788f2841f.png)



# Projeto 2: 2º Semestre de 2021

### Parceiro acadêmico: <a href="http://necto.com.br/pt/">NECTO Systems</a>

<details><summary>Logo da Empresa</summary>
<br><br>
	
<p align="center">
 <a href="http://necto.com.br/pt/"><img src="https://user-images.githubusercontent.com/80851038/133914328-794317fa-31e1-4279-afb0-d986acb5db45.png" width="320"/></a>
</p>

</details>


<br>

## Objetivo do projeto:

O desafio consiste em apresentar para o cliente Necto Systems, uma solução referente ao problema no monitoramento de um ou mais SGBDs remotos, bem como na coleta de métricas de funcionamento dos Banco de Dados presentes nos servidores da empresa.

Tendo isso em mente, o objetivo da equipe é desenvolver um software integrado que monitore e apresente métricas referentes ao uso e a saúde do SGBD em tempo real. Além de oferecer um pós gerenciamento de múltiplos BDs no servidor, como diferencial.

<br>

## Tecnologias Utilizadas:

### `Java ` 

A linguagem de programação Java possui várias finalidades. É usada para desenvolvimento de aplicativos de desktop com interfaces gráficas, aplicativos web dinâmicos e escaláveis, aplicativos móveis para Android, aplicativos empresariais confiáveis e de alto desempenho, sistemas embarcados como IoT, desenvolvimento de jogos e aplicações científicas e análise de dados. Sua versatilidade permite seu uso em uma ampla gama de aplicações.

A linguagem de programação Java tem vários outros objetivos, incluindo:

1. Desenvolvimento de aplicativos de desktop com a biblioteca Swing e AWT.
2. Desenvolvimento de aplicativos web usando JavaServer Pages (JSP) e Servlets, além de frameworks como Spring e JSF.
3. Desenvolvimento de aplicativos móveis nativos para Android.
4. Desenvolvimento de aplicativos empresariais robustos e escaláveis.
5. Desenvolvimento de sistemas embarcados e aplicativos de IoT usando Java ME.
6. Desenvolvimento de jogos, especialmente para dispositivos móveis, com bibliotecas como libGDX.
7. Desenvolvimento de aplicações científicas e análise de dados usando bibliotecas como Apache Spark e Hadoop.

<br>

- Para mais informações acesse este site para entender melhor o funcionamento e aplicabilidade dessa tecnolgia [Java]([https://vuejs.org/](https://www.alura.com.br/cursos-online-programacao/java?gclid=CjwKCAjwvdajBhBEEiwAeMh1UzkpkuL-4lrua7qSKEgU3mx2DGLD0x08seaw__H3-jBDp6RC2I7vyRoCafQQAvD_BwE))

### `PostgreSQL ` 

O PostgreSQL é um sistema de gerenciamento de banco de dados relacional de código aberto. Ele fornece um ambiente robusto e confiável para armazenar, organizar e gerenciar dados estruturados. O PostgreSQL suporta SQL completo, incluindo consultas complexas, transações ACID (Atomicidade, Consistência, Isolamento e Durabilidade) e possui recursos avançados, como indexação, gatilhos, visões e funções armazenadas. É conhecido por sua estabilidade, escalabilidade e flexibilidade, sendo amplamente utilizado em uma variedade de aplicativos e cenários, desde pequenos projetos até sistemas empresariais de alto tráfego.


- Para mais informações acesse o site oficial da ferramenta [PostgreSQL](https://www.postgresql.org/)

<br>

### `SQLite ` 

O SQLite é um sistema de gerenciamento de banco de dados relacional de código aberto, que é amplamente utilizado em aplicativos embarcados e de pequeno porte. Diferente de outros sistemas de banco de dados, o SQLite é uma biblioteca que pode ser incorporada diretamente nas aplicações, sem a necessidade de um servidor separado. Ele é conhecido por ser leve, rápido, autossuficiente e não requer configuração ou administração complexa. O SQLite suporta a maioria dos recursos de banco de dados tradicionais, como tabelas, consultas SQL, índices e transações. É uma opção popular para aplicativos móveis, navegadores da web e outros casos em que a simplicidade e a eficiência são prioridades.

- Para mais informações acesse o site oficial da ferramenta [SQLite](https://sqlite.org/index.html)

<br>

### Contribuições Pessoais:
Neste projeto tive como atividade principal a criação de estrutura segura para conexão aos servidores dos bancos de dados do cliente, os que seriam usados posteriormente para monitoramento. A criação de estrutura foi feita em java, seguindo as especificações de strings de conexão colhidas no PostgreSQL. 
Esta estrutura também contava com verificações de problemas nas requisições e definições de tempo máximo para busca, além de realizar buscar por metadados.


<br>

<details><summary> Definição de estrutura de conexão</summary> 
	
```
	
      public conexao(String databaseName) {
		
		
		
		System.out.println("Digite seu login de conexão com o banco de dados nos respectivos campos ");
		System.out.println("url: ");
		String url = sc.next();
		System.out.println("Usuário: ");
		String user = sc.next();
		System.out.println("Senha: ");
		String pass = sc.next();
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url + databaseName, user, pass);
			//System.out.println("Banco conectado com sucesso!");
		} catch (Exception e) {
			throw new Error("Houve um problema ao conectar no banco de dados!");
		}
	}
	
```
	
</details>

<details><summary>Verificação de acesso a base</summary> 
	
Erro ao encontrar tabela de dados:

```

			if (tableSize.isEmpty()) {
				System.out.println("Nenhuma tabela encontrada");
			}

			conx.closeConnection();
	
```

Verificação geral de busca de dados:
	
```
	catch (Exception e) {
			e.printStackTrace();
			System.out.println("Houve um problema ao requisitar o tamanho das tabelas de todos os banco de dados!");
		}

```
		
	
</details>

<br>


## Aprendizados efetivos:

Neste projeto, tive a oportunidade de atuar como P.O. (Product Owner) do projeto, tendo oportunidade de desenvolver habilidades de Soft Skills, principalmente de comunicação para definição de planejamento de entregas e organização de equipe. 
Como desenvolvedor focado em back-end, pude focar em tarefas voltadas ao preparo de ambiente para utiização das tecnologias citadas acima, estruturação de repositórios e pastas para utilização do Java. Também o desenvolvimento de funções em Java, o que agregou muito para o meu entendimento de como algoritmos de programação funcionam e a importância de ter uma estrutura e regras de acesso muito bem definidas para que a aplicação funcione da forma robusta.
Voltado para conhecimentos de DBA (Database Administrator), pude desenvolver habilidades de acesso a banco de dados utilizando strings de conexão, realizar inserções e consultas dos dados de forma segura.

<br>


# Projeto 3: 1º Semestre de 2022

### Parceiro acadêmico: <a href="https://www.midall.com.br/">MidAll</a>

<details><summary>Logo da Empresa</summary>
<br><br>
<img src ="https://user-images.githubusercontent.com/80851038/163725778-498ec2e9-e8eb-45cf-a586-848e5bb1dd97.png"/></details>

<br>

## Objetivo do projeto:

Ferramenta para criar promoções de E-commerce, onde as mecânicas de promoções são feitas de forma flexível e de rápida atualização no sistema. As regras de promoções são cadastradas e posteriormente aplicadas no momento em que os itens são adicionados ao carrinho.

Atualmente implementamos e apresentamos o cadastro dos produtos dentro de promoções registradas dentro do servidor/banco de dados, utilizando operadores lógicos para criar diferentes mecânicas de promoções, os descontos são aplicados dentro da sacola de compras e possui uma visualização dedicada para conferência e escolha de promoções.

Além disso, há a autonomia fornecida ao usuário para editar, remover, arquivar ou desarquivar seus produtos e também para editar, deletar, interromper ou ativar promoções de uma visualização de maneira prática e intuitiva dos produtos e promoções cadastradas através da listagem que possui um filtro para que seja possível diferenciar quais os status de produtos e promoções.
<br><br>


## Tecnologias Utilizadas:

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

 <details><summary>Cadastro de promoções</summary> 
 
 <br>
 
  O cadastro de promoções era parte fundamental para o projeto, que tem por intenção, suprir a principal necessidade do cliente. 
 
 <br>
  Exemplo de código:
 
 ~~~
 
 	$(document).ready(function() {

		$.ajax({
			url: "http://localhost:8080/cadastroPromocao",
			async: false,
			data: JSON.stringify(
				{
					"id": 0,
					"nomeVenda": codigoVenda,
					"descVenda": nomeVenda,
					"catVenda": catVenda,
					"quantVenda": quantVenda,
					"valorVenda": valorVenda,
				}
			),
			type: 'POST',
			headers: {
				Accept: 'application/json;charset=utf-8',
				'Content-Type': 'application/json'
			},
			dataType: 'json'
		});
		console.log("Inserção Realizada!")
	});
 ~~~
 </details>
 
 <details><summary>Definições de endpoints;</summary> 
 </details>
 <details><summary> Verificação de promoções cadastradas;</summary> 
 </details>
 <details><summary>Requisições HTTP.</summary> 
 </details>

 


<br>

## Aprendizados efetivos:

Durante a segunda sprint tivemos que fazer uma reestruturação na equipe, onde tive participação fundamental na organização da equipe. Assumindo uma nova função como _PO (Product Owner)_ da equipe até a finalização do projeto, onde pude colocar em prática as ferramentas das metodologias ágeis aprendidas em aula, seguindo o SCRUM. 

<br>

<br>


# Projeto 4: 2º Semestre de 2022

### Parceiro acadêmico: <a href="https://www.subiter.com/">Subiter</a>

<details><summary>Logo da Empresa</summary>
<br><br>
<img src="https://user-images.githubusercontent.com/80851038/190831621-96d01aab-af9f-4b9b-a7c5-9e6419d287bb.jpeg" 
 width="35%"/></details>


<br>

## Objetivo do projeto:

Tiveos um desafio de sincronização dos dados administrativos, financeiros e operacionais referentes aos serviços prestados pela empresa. A falta de organização dos dados acarreta lentidão para atender chamados, e confusão na interpretação dos indicadores comerciais e financeiros.

Desenvolvemos uma plataforma web que organiza todos os dados referentes aos serviços prestados pela empresa, de forma interpretada, cujo o principal objetivo é criar chamados e agendamentos conforme as necessidades do cliente e solucioná-los de forma ponta a ponta entre a relação do cliente com o suporte e, suporte com a do administrador que, trabalha na criação e sincronização dos dados em um único lugar.

<br>

## Tecnologias Utilizadas:

### `Vue.js ` 

Vue.js é amplamente utilizado em aplicações web para o desenvolvimento do front-end. Sua simplicidade, flexibilidade e eficiência o tornam uma escolha popular para a criação de interfaces de usuário interativas e responsivas.

No contexto do front-end, o Vue.js facilita a criação de componentes reutilizáveis que podem ser compostos para formar interfaces complexas. Isso promove uma estrutura organizada e modular, permitindo aos desenvolvedores dividir o código em partes menores e mais gerenciáveis. Essa abordagem facilita a manutenção do código, melhorando a legibilidade e reusabilidade.

No que diz respeito à criação de estrutura de requisições, o Vue.js é uma biblioteca focada principalmente no desenvolvimento de interfaces de usuário. Embora o Vue.js possa lidar com solicitações HTTP por meio de bibliotecas de terceiros, como o Axios, a criação de uma estrutura completa de requisições vai além do escopo principal do Vue.js. Nesse caso, é comum combinar o Vue.js com outras bibliotecas ou frameworks específicos para manipulação de requisições, como o Vue Resource ou o Vuex, dependendo dos requisitos do projeto.

O Vue.js oferece uma base sólida para o desenvolvimento de interfaces de usuário eficientes e responsivas. 

- Para mais informações acesse o site oficial da ferramenta [Vue.js](https://vuejs.org/)

<br>

### `SASS ` 
Sass (Syntactically Awesome Style Sheets) é uma linguagem de folhas de estilo que melhora o CSS, oferecendo recursos como variáveis, aninhamento, mixins, herança, importação, funções e operações matemáticas. Ele precisa ser compilado para CSS antes de ser interpretado pelos navegadores. O Sass é útil para front-end, facilitando a escrita e organização do código CSS, resultando em um fluxo de trabalho mais eficiente e produtivo.

- Para mais informações acesse o site oficial da ferramenta [SASS](https://sass-lang.com/)

<br>

### Contribuições Pessoais:
Neste projeto fui responsável pela criação da estrutura de requisições HTTP, utilizando uma nova tecnologia no front-end, o vue.js além disso, fui reponsável pelo desenvolvimento das telas, bem como design seguindo fielmente a estrutura do figma e também pela conectividade com funções do back-end. Também usando o vue.js, criei diferentes funções para focadas em dispodição de dados no front-end e acesso, ao que seria, um novo modelo de estruturação de pastas do projeto.
Afim de melhorar o front-end, utilizei uma nova tecnologia, o Sass. Que melhora a visualização de componentes/design em geral, a partir do CSS. 

<details><summary> Definição de endpoint</summary> 
	
```
	fetch("https://subiter.herokuapp.com/requests", requestOptions)
        		.then((response) => response.text())
        		.then((result) => {
          		this.chamados = JSON.parse(result);
	
```
	
</details>

<details><summary>Requisições HTTP</summary> 
	
```
	import ChamadosComponent from "@/components/ChamadosComponent.vue";
		
	export default {
 		name: "ChamadosView",
  		components: {
    			ChamadosComponent,
    			FormChamado,
    			DeleteChamado,
    			UpdateChamados,
    			AlertComponent
  	},
  	data() {
    		return {
      		chamados: [],
    	};
  	},
  	methods: {
    	//faz o get da tabela
    	load() {
      	var myHeaders = new Headers();
      	var token = localStorage.getItem("Token");
      	// console.log(token)
      	myHeaders.append("Content-Type", "application/json");
      	myHeaders.append("Authorization", `${token}`);

      	var requestOptions = {
        	method: "GET",
        	headers: myHeaders,
        	redirect: "follow",
      	};

      	fetch("https://subiter.herokuapp.com/requests", requestOptions)
        		.then((response) => response.text())
        		.then((result) => {
          		this.chamados = JSON.parse(result);
        	});
    	    },
  	},
```
	
</details>

<details><summary>Export de dados</summary> 

```
  export default {
  name: "AgendamentosComponent",
  props: {
    agendamentos: Array,
  },
  data(agendamentos) {
    console.log(agendamentos);
    return {
      search: "",
      headers: [
        {
          text: "Código",
          align: "start",
          sortable: false,
          value: "id",
        },
        { text: "Tipo de Serviço", value: "serviceProvided" },
        { text: "Horario", value: "appointment" },
        { text: "Data", value: "date" },
        { text: "Endereço", value: "address" },
        { text: "Cidade", value: "city" },
        { text: "Estado", value: "state" },
        { text: "CEP", value: "zipcode" },
      ],
    };
  },

		
```
</details>

<details><summary>Exemplo de arquivo de desgin do Sass</summary>

```
.iconChat {
    background: #0257fd;
    color: #fff;
    position: fixed;
    bottom: 20px;
    right: 20px;
    padding: 10px;
    border-radius: 50%;
    width: 50px;
    height: 50px;
    display: flex;
    align-items: center;
    justify-content: center;
    cursor: pointer;
    z-index: 20;
}

```
	
</details>


<br>


## Aprendizados efetivos:

Neste projeto, tive a oportunidade de atuar em uma nova posição desde o meu ingresso na Fatec, sendo desenvolvedor focado em front-end e requisições de dados. Para isso, utilizamos como ferramenta principal o Vue.js, uma tecnologia nova para mim, que ampliou minha forma de pensar. Com ela, pude realizar tarefas variadas, desde o desenvolvimento de interfaces e design de telas até a criação de uma estrutura que permitiu a interação e a troca de informações de maneira eficiente em conjunto com o back-end. Essa experiência contribuiu para o aprimoramento das minhas habilidades e consolidou meu conhecimento nesse campo da programação.
