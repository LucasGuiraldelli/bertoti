# Lucas Guiraldelli da Silva

## Introdução


![image](https://user-images.githubusercontent.com/64923139/197658220-a1e1a80a-8c97-44dc-9c65-589788f2841f.png)




Olá! me chamo Lucas Guiraldelli, sou nascido e criado no ABC paulista (região metropolitana de São Paulo). Ao longo da vida, fui me interessando por tecnologia através dos jogos de videogame e desde sempre, por ser uma pessoa muito curiosa, queria entender como as coisas funcionavam por trás da máquina. Então, iniciei a fazer alguns cursos relacionados a área quando tinha 11 anos. Aos 13 tive meu primeiro contato com a robótica e programação. Conforme fui me desenvolvendo nos cursos, e na vida, foi aumentando meu interesse sobre tecnologia e aos 15 anos iniciei o curso técnico voltado para Análise e Desenvolvimento de Sistemas, que foi um divisor de àguas para mim, e fundamental para que eu escolhesse o foco do meu próximo passo na carreira, a faculdade.<br> Como nada foi fácil até então, na faculdade não poderia ser diferente, escolhi seguir na àrea de banco de dados, faculdade que só existia a oportunidade em são José dos Campos. Como meu final do ensino médio, o início da faculdade (FATEC Prof. Jessen Vidal) foi marcado pela pandemia da Covid-19, o que me daria certeza de ano no formato EAD (Ensino a distância), e com isso um tempo para que eu conseguisse um emprego para me manter em outra cidade. Depois de muitos processos seletivos, no inicio de 2022 consegui uma vaga, como estágiário na Johnson&Johnson, empresa que estou até hoje no setor de Data Science. 
Hoje tenho 20 anos e trabalho como Cientista de Dados na maior empresa de saúde do mundo. <br> 
Meus principais hobbies são: jogar futebol, jogar video game e sair com meus amigos. Um hobby muito recente é jogar sinuca, confesso que ainda estou aprendendo, porém melhorando.


<br>




# Projeto 1: 1º Semestre de 2021

### Como primeiro projeto da Faculdade, neste semestre não tivemos uma empresa externa como parceira para desenvolvimento de uma dor real. 

<details><summary>Logo do produto desenvolvido: Helena</summary>
<br><br>
	
<p align="center">
<img src="https://user-images.githubusercontent.com/80851038/118410251-e2069880-b664-11eb-9eb6-b9bdfc8526eb.png" width="920px" height="330px">
</p>
<br>
</details>


<br>

## Objetivo do projeto:

Desenvolvida para ser uma assistente virtual de viagens. Helena responde a comandos de voz e possui como principal objetivo garantir ao usuário uma experiência otimizada e agradável quando estiver viajando. E proporciona, de forma única, diversas funcionalidades que podem ser de grande ajuda em certos momentos.
De cidades históricas aos grandes centros urbanos o app foi criado por nós, para você amante de viagens.

<br>

## Tecnologias Utilizadas:

### ` React Native ` 

O React Native é um framework para desenvolvimento de aplicativos móveis que permite criar apps nativos para iOS e Android usando JavaScript. Ele usa uma camada de abstração sobre os elementos de interface nativos, permitindo a criação de componentes reutilizáveis. Esses componentes são traduzidos em elementos nativos da interface, proporcionando uma experiência nativa. O React Native facilita o compartilhamento de código entre plataformas, aumentando eficiência e produtividade. Seu objetivo é oferecer uma maneira eficaz de criar aplicativos móveis nativos, usando JavaScript e aproveitando recursos nativos do dispositivo. É uma escolha popular para o desenvolvimento rápido de apps móveis com experiência do usuário nativa.

- Para mais informações, acesse o [site oficial do React Native](https://reactnative.dev/)

### ` JavaScript ` 

JavaScript é uma linguagem de programação amplamente usada no desenvolvimento web. Suas principais utilidades incluem manipulação do DOM, validação de formulários, requisições assíncronas, manipulação de dados, criação de animações e interação com APIs externas. Com bibliotecas e frameworks, é possível criar efeitos visuais, jogos web e integrar funcionalidades de terceiros. JavaScript é suportado pelos navegadores modernos e é uma escolha poderosa para criar páginas interativas, responsivas e dinâmicas.

- Para mais informações, acesse [este site](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript) para entender melhor o funcionamento e aplicabilidade dessa tecnologia.


<br>

### Contribuições Pessoais:

Neste projeto, principalmente, fui responsável pela pela parte de estruturar o back-end do projeto utilizando ReactNative e pelo desenvolvimento de telas. 
Como principais tarefas desenvolvidas de back-end, destaco o a atividade de conexão com dieferentes API's, como foi o caso da conexão com a API do google para ter acesso a localização do usuário em tempo real, ter acesso a previsão do tempo deste local, identificação de locais para visitação e ao mapa, para trazer a rota que leva o usuário ao ponto turístico escolhido.
No front-end, tive atuação principalmente no desenvolvimento de telas, como foi o caso da tela de previsão do tempo e de lista de função disponibilizadas pelo nosso app.


<br>

<details><summary>Definição de palavras chave para ativação e chamada da função</summary> 
	
```
export default class Converter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      coinA: props.coinA,
      coinB: props.coinB,
      coinA_value: 0,
      convertedValue: 0,
    };

    this.converter = this.converter.bind(this);
  }

  async converter() {
    let from_to = this.state.coinA + "_" + this.state.coinB;

    const response = await api.get(
      `convert?q=${from_to}&compact=ultra&apiKey=d8148018a3851e72d0e5`
    );

    let price = response.data[from_to];

    let result = price * parseFloat(this.state.coinA_value);

    this.setState({ convertedValue: result.toFixed(2) });
    Keyboard.dismiss();
  }
	
```

O código define uma classe chamada "Converter" que estende um componente React. A classe possui um construtor que inicializa o estado com as moedas e valores iniciais. A função assíncrona "converter" faz uma chamada à API para obter a taxa de conversão entre as moedas selecionadas. Em seguida, calcula o valor convertido com base na taxa e no valor da moeda de origem. O resultado é arredondado e atualizado no estado.
	
</details>

<details><summary>Definição de palavras chave para ativação e chamada da função</summary> 
	
```
words: [
      'Helena abrir conversor de medidas',
      'Helena conversor de medidas'
	]
	
```
	
</details>

<details><summary>Exemplo de estilização da tela</summary> 
	
```
  const styles = StyleSheet.create({
    container: {
    	flex: 1,
    	paddingHorizontal: 20,
   	paddingVertical: 20,
    	marginTop: 20,
    	backgroundColor: "#FFF"
  },
  Body: {
    flex: 1
  },
}
	
```


Essas linhas de código definem estilos para componentes React Native. O estilo "container" configura o elemento para ocupar todo o espaço disponível com um espaçamento e margem específicos, além de uma cor de fundo branca. O estilo "Body" apenas define que o elemento ocupará todo o espaço disponível.
	
</details>


<br>


## Aprendizados efetivos:

Como primeiro projeto da faculdade, tive a oportunidade de explorar novas tecnologias, proporcionando um amplo espaço para aprendizado. Algumas das principais experiências incluíram:

#### Soft Skills Desenvolvidas:

- **Comunicação:**
  - Melhorei minhas habilidades de comunicação através do contato com o cliente interno, entendendo suas necessidades e requisitos.
  - Colaborei efetivamente em equipe, contribuindo para o ambiente de trabalho colaborativo.

- **Trabalho em Equipe:**
  - Participando do desenvolvimento do projeto, aprimorei minhas habilidades de trabalho em equipe, essenciais para o sucesso do projeto.

#### Hard Skills Desenvolvidas:

| Hard Skill                           | Nota (0-10) |
|--------------------------------------|-------------|
| Metodologia Ágil - Scrum             | 8           |
| Estruturação de Projetos             | 7           |
| Versionamento de Código              | 8           |
| Fluxo de Desenvolvimento de Projeto   | 7           |
| Lógica de Programação                | 9           |
| Endereçamento de Telas (ReactNative) | 8           |
| Criação de Funções (JavaScript)      | 9           |



<br>



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

### ` Java ` 

A linguagem de programação Java é versátil, sendo utilizada em diversas aplicações, como o desenvolvimento de aplicativos de desktop, web, móveis (Android), sistemas empresariais, IoT, jogos e análise de dados. Sua flexibilidade a torna uma escolha abrangente para uma variedade de aplicações.

- Para mais informações, acesse [este site](https://www.alura.com.br/cursos-online-programacao/java?gclid=CjwKCAjwvdajBhBEEiwAeMh1UzkpkuL-4lrua7qSKEgU3mx2DGLD0x08seaw__H3-jBDp6RC2I7vyRoCafQQAvD_BwE)

### ` PostgreSQL ` 

O PostgreSQL é um sistema de gerenciamento de banco de dados relacional de código aberto, conhecido por sua estabilidade, escalabilidade e flexibilidade. Suporta SQL completo, transações ACID e oferece recursos avançados para projetos de pequeno a grande porte.

- Para mais informações, acesse o [site oficial do PostgreSQL](https://www.postgresql.org/)

### ` SQLite ` 

O SQLite é um sistema de gerenciamento de banco de dados relacional de código aberto, leve e rápido, amplamente utilizado em aplicativos embarcados e de pequeno porte. Sua característica de ser uma biblioteca incorporada o torna uma escolha popular para casos que demandam simplicidade e eficiência.

- Para mais informações, acesse o [site oficial do SQLite](https://sqlite.org/index.html)

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

Essas linhas de código definem um construtor que solicita ao usuário informações de login para se conectar a um banco de dados PostgreSQL e estabelece a conexão usando essas informações.
	
</details>

<details><summary>Verificação de acesso a base</summary> 
	
Erro ao encontrar tabela de dados:

```

			if (tableSize.isEmpty()) {
				System.out.println("Nenhuma tabela encontrada");
			}

			conx.closeConnection();
	
```

Essas linhas de código fazem uma verificação condicional para verificar se a variável "tableSize" está vazia. Se estiver vazia, uma mensagem "Nenhuma tabela encontrada" é impressa no console.

<br>

Verificação geral de busca de dados:
	
```
	catch (Exception e) {
			e.printStackTrace();
			System.out.println("Houve um problema ao requisitar o tamanho das tabelas de todos os banco de dados!");
		}

```

Essas linhas de código estão dentro de um bloco catch, que trata exceções do tipo Exception. Se ocorrer alguma exceção, o método "printStackTrace()" é chamado para imprimir o rastreamento da exceção no console. Em seguida, uma mensagem "Houve um problema ao requisitar o tamanho das tabelas de todos os banco de dados!" é impressa no console.
		
	
</details>

<br>


## Aprendizados efetivos:

#### Soft Skills Desenvolvidas:

Durante o projeto, desenvolvi habilidades significativas em soft skills, destacando especialmente:

1. **Comunicação:**
   - Interagindo como _Product Owner_, aprimorei minhas habilidades de comunicação para facilitar a definição do planejamento de entregas.
   - Organizei eficientemente a equipe por meio de comunicação clara, garantindo um entendimento comum dos objetivos.

2. **Trabalho em Equipe:**
   - Colaborei na organização da equipe, promovendo um ambiente cooperativo para alcançar metas comuns.

3. **Planejamento:**
   - Contribuí ativamente para a definição de planejamentos eficazes, alinhando as metas do projeto com as expectativas da equipe.

#### Hard Skills Desenvolvidas:

| Hard Skill                    | Nota (0-10) |
|-------------------------------|-------------|
| Desenvolvimento Java           | 8           |
| Estruturação de Repositórios   | 9           |
| Algoritmos de Programação      | 8           |
| Strings de Conexão (DBA)       | 7           |
| Acesso a Banco de Dados       | 8           |

1. **Desenvolvimento Java:**
   - Foco em tarefas de back-end, desenvolvimento de funções em Java, contribuindo para uma compreensão mais profunda de algoritmos de programação.

2. **Estruturação de Repositórios:**
   - Dedicação à organização eficiente de repositórios e pastas, facilitando a utilização de Java.

3. **Algoritmos de Programação:**
   - Aprofundamento no entendimento de algoritmos, essenciais para o desenvolvimento robusto.

4. **Strings de Conexão (DBA):**
   - Habilidades aprimoradas na manipulação de strings de conexão para acesso seguro a banco de dados.

5. **Acesso a Banco de Dados:**
   - Desenvolvimento de habilidades como DBA, realizando inserções e consultas de dados de forma segura.

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

<br>

## Tecnologias Utilizadas:

### ` jQuery ` 

jQuery, uma biblioteca JavaScript criada por John Resig em 2006, é licenciada como software de código aberto pelo Massachusetts Institute of Technology (MIT) e pelo GNU General Public License (GPL). Sua principal finalidade é aprimorar dinamismo e usabilidade em páginas da web, associando-se aos elementos JavaScript em HTML. Suas linhas de código simplificam scripts client-side, tornando-a uma das bibliotecas mais populares entre os desenvolvedores. Acesse a [documentação oficial aqui](https://jquery.com/).

### ` Hibernate ` 

O Hibernate ORM facilita o desenvolvimento de aplicativos cujos dados persistem ao longo do processo. Como um framework Object/Relational Mapping (ORM), gerencia a persistência de dados em bancos de dados relacionais via JDBC. Além de sua própria API "nativa", o Hibernate é uma implementação da especificação Java Persistence API (JPA), sendo compatível com ambientes que suportam JPA, como aplicativos Java SE, servidores de aplicativos Java EE e contêineres Enterprise OSGi.

### ` Quarkus ` 

Desenvolvido para atender às demandas de aplicativos modernos e nativos da nuvem, o Quarkus é uma estrutura Java nativa do Kubernetes, adaptada para GraalVM e HotSpot. Criado a partir das melhores bibliotecas e padrões Java, o Quarkus tem como objetivo fazer do Java a principal plataforma em Kubernetes e ambientes sem servidor. Oferece aos desenvolvedores uma estrutura para atender a diversas arquiteturas de aplicativos distribuídos, superando os desafios das pilhas Java tradicionais.


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

Durante a segunda sprint, experimentei uma reestruturação na equipe, desempenhando um papel fundamental na organização. Assumi uma nova função como _PO (Product Owner)_ da equipe até a conclusão do projeto, aplicando práticas das metodologias ágeis aprendidas em sala de aula, seguindo o SCRUM.

#### Soft Skills Desenvolvidas:

- **Liderança:**
  - Na reestruturação da equipe, exerci uma liderança efetiva para garantir uma transição suave.

- **Adaptabilidade:**
  - Assumir o papel de _Product Owner_ demandou rápida adaptação às novas responsabilidades e demandas do projeto.

- **Comunicação:**
  - Comuniquei eficientemente as necessidades e objetivos da equipe, facilitando o entendimento e a colaboração.

- **Gestão de Equipe:**
  - Desenvolvi habilidades de gestão ao liderar a equipe até a conclusão do projeto.

#### Hard Skills Desenvolvidas:

| Hard Skill                           | Nota (0-10) |
|--------------------------------------|-------------|
| Metodologias Ágeis (SCRUM)           | 9           |
| Gestão de Projetos (Product Owner)   | 8           |


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

Tivemos um desafio de sincronização dos dados administrativos, financeiros e operacionais referentes aos serviços prestados pela empresa. A falta de organização dos dados acarreta lentidão no atendimento de chamados e confusão na interpretação dos indicadores comerciais e financeiros.

Desenvolvemos uma plataforma web que organiza todos os dados relacionados aos serviços prestados pela empresa de forma interpretada, tendo como principal objetivo criar chamados e agendamentos conforme as necessidades do cliente e solucioná-los de forma integrada entre a relação do cliente com o suporte e o suporte com o administrador, que trabalha na criação e sincronização dos dados em um único lugar.

<br>

## Tecnologias Utilizadas:

### ` Vue.js ` 

Vue.js é uma escolha popular no desenvolvimento front-end devido à sua simplicidade, flexibilidade e eficiência para criar interfaces de usuário interativas e responsivas.

No front-end, o Vue.js simplifica a criação de componentes reutilizáveis, promovendo uma estrutura organizada e modular. Isso facilita a manutenção, aumentando a legibilidade e reusabilidade do código.

Embora o Vue.js possa lidar com solicitações HTTP usando bibliotecas como o Axios, para estruturas completas de requisições, é comum combinar o Vue.js com outras bibliotecas específicas, como Vue Resource ou Vuex, dependendo dos requisitos do projeto.

O Vue.js oferece uma base sólida para desenvolver interfaces de usuário eficientes e responsivas.

- Para mais informações, acesse o [site oficial do Vue.js](https://vuejs.org/)

<br>

### `SASS ` 
Sass (Syntactically Awesome Style Sheets) é uma linguagem de folhas de estilo que aprimora o CSS, introduzindo recursos como variáveis, aninhamento, mixins, herança, importação, funções e operações matemáticas. Precisa ser compilado para CSS antes de ser interpretado pelos navegadores. O Sass é valioso para o front-end, melhorando a escrita e organização do código CSS, resultando em um fluxo de trabalho mais eficiente e produtivo.

- Para mais informações, acesse o [site oficial do SASS](https://sass-lang.com/)

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

Essas linhas de código estão utilizando a função fetch para fazer uma requisição HTTP para a URL "https://subiter.herokuapp.com/requests" com as opções definidas em "requestOptions".
	
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
	}	
}

```

Esse trecho de código exporta um componente Vue chamado "ChamadosView" que utiliza vários outros componentes. Ele possui uma propriedade "chamados" que é inicializada como uma matriz vazia. Além disso, contém um método chamado "load" que faz uma requisição GET para obter dados de uma tabela, utilizando um token de autorização.
	
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
}

		
```


Esse trecho de código define um componente Vue chamado "AgendamentosComponent" que recebe um array chamado "agendamentos" como propriedade. Ele possui um valor vazio para a propriedade "search" e define as configurações dos cabeçalhos de uma tabela.
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

Essas linhas de código definem estilos CSS para um ícone de chat flutuante no canto inferior direito da tela. O ícone possui um formato circular, fundo azul, texto branco e um tamanho de 50x50 pixels. É clicável, exibindo um cursor de ponteiro.
	
</details>


<br>


## Aprendizados efetivos:

Neste projeto da Fatec, atuei como desenvolvedor especializado em front-end e requisições de dados, utilizando Vue.js como principal ferramenta. Essa experiência ampliou minha perspectiva, permitindo-me realizar diversas tarefas, desde o design de interfaces até a criação de uma estrutura eficiente para interação com o back-end. Este aprendizado significativo não apenas aprimorou minhas habilidades, mas também consolidou meu conhecimento na programação, representando um avanço valioso em minha jornada profissional.

#### Soft Skills Desenvolvidas:

- **Adaptabilidade:**
  - Adaptei-me rapidamente ao ambiente de trabalho e à nova tecnologia (Vue.js), demonstrando flexibilidade.

- **Colaboração:**
  - Colaborei efetivamente com a equipe de back-end, facilitando uma integração harmoniosa entre as camadas front-end e back-end.

- **Resolução de Problemas:**
  - Enfrentei desafios na criação da estrutura de interação e troca de informações, desenvolvendo habilidades sólidas de resolução de problemas.

- **Aprendizado Contínuo:**
  - Demonstrei disposição para aprender e me aprimorar, especialmente ao lidar com uma tecnologia nova.

#### Hard Skills Desenvolvidas:

| Hard Skill                    | Nota (0-10) |
|-------------------------------|-------------|
| Vue.js                        | 9           |
| Desenvolvimento Front-End     | 8           |
| Requisições de Dados          | 8           |
| Design de Interfaces          | 7           |
| Estruturação de Informações   | 8           |


<br>

<br>


# Projeto 5: 1º Semestre de 2023

### Parceiro acadêmico: <a href="https://www.midall.com.br/">MidAll</a>

<details><summary>Logo da Empresa</summary>
<br><br>
<img src ="https://user-images.githubusercontent.com/80851038/163725778-498ec2e9-e8eb-45cf-a586-848e5bb1dd97.png"/></details>

<br>

## Objetivo do projeto:


Automatizamos a jornada de download de arquivos armazenados em uma plataforma de vídeo, realizando a transferência para a nuvem por meio do desenvolvimento de um serviço tipo aplicativo. A única interação do usuário com o serviço é por meio de um menu de configuração, que contém os parâmetros necessários para a execução do download. O serviço processa automaticamente os arquivos, gerando alertas em caso de erros de processamento.
Além disso, o sistema salva os metadados dos arquivos para a construção de um dashboard de monitoramento da execução do serviço. Isso possibilita a análise posterior de resultados e indicadores, como a quantidade de arquivos transferidos, a quantidade de bytes transferidos, o tempo de transferência, entre outros.

<br>

## Tecnologias Utilizadas:

### ` Vue.js ` 

Vue.js é uma escolha popular no desenvolvimento front-end devido à sua simplicidade, flexibilidade e eficiência para criar interfaces de usuário interativas e responsivas.

No front-end, o Vue.js simplifica a criação de componentes reutilizáveis, promovendo uma estrutura organizada e modular. Isso facilita a manutenção, aumentando a legibilidade e reusabilidade do código.

Embora o Vue.js possa lidar com solicitações HTTP usando bibliotecas como o Axios, para estruturas completas de requisições, é comum combinar o Vue.js com outras bibliotecas específicas, como Vue Resource ou Vuex, dependendo dos requisitos do projeto.

O Vue.js oferece uma base sólida para desenvolver interfaces de usuário eficientes e responsivas.

- Para mais informações, acesse o [site oficial do Vue.js](https://vuejs.org/)

<br>

### `Zube ` 

O Zube é uma plataforma que se concentra na gestão de problemas (issues) de projetos de software, oferecendo uma integração eficiente com o GitHub. Ele permite que equipes gerenciem e organizem suas tarefas, acompanhando o progresso de diferentes problemas, desde a identificação até a resolução. A integração com o GitHub é uma das características-chave, possibilitando a sincronização direta das issues entre as duas plataformas, simplificando o fluxo de trabalho para desenvolvedores e equipes de projeto. Isso significa que as atualizações feitas no Zube refletem-se automaticamente no GitHub e vice-versa, mantendo todos os envolvidos atualizados e alinhados com as mudanças e progresso do projeto.

<br>

### `DevOps ` 

DevOps é uma abordagem de desenvolvimento de software que combina equipes de desenvolvimento e operações para agilizar processos e fornecer software de alta qualidade com mais eficiência. Ele promove colaboração, automação e melhoria contínua. Os benefícios do DevOps incluem maior colaboração e comunicação, integração e entrega contínuas, tempo de lançamento no mercado mais rápido, melhor qualidade de software, maior confiabilidade e estabilidade, escalabilidade e flexibilidade, monitoramento e feedback contínuos e otimização de custos. No geral, o DevOps alinha equipes, acelera a entrega de software, melhora a qualidade e aumenta a satisfação do cliente.

<br>

### `Github Actions ` 

GitHub Actions é uma ferramenta de automação fornecida pelo GitHub para integração contínua. Ele permite que os desenvolvedores criem fluxos de trabalho, que são sequências de ações que automatizam tarefas como construção, teste e implantação de projetos de software. Os fluxos de trabalho são acionados por eventos, como alterações de código, garantindo um processo padronizado para integração de código.

A integração contínua no GitHub Actions envolve a integração automática de alterações de código em um repositório compartilhado. Os fluxos de trabalho podem ser acionados por push de código ou pull requests, permitindo a detecção precoce de problemas ou conflitos. GitHub Actions oferece uma ampla variedade de ações pré-construídas e oferece suporte a ações personalizadas, permitindo que os desenvolvedores criem fluxos de trabalho personalizados. Ele se integra perfeitamente a outros recursos do GitHub, aprimorando a experiência de desenvolvimento.

Ao utilizar GitHub Actions para integração contínua, os desenvolvedores podem melhorar a qualidade do software, reduzir tarefas manuais e aumentar a produtividade.

<br>

### `Unit tests ` 

Os testes unitários são testes automatizados que validam a interface do usuário, as interações do usuário e a lógica do lado do cliente de um aplicativo da web. Eles são importantes porque garantem a consistência da IU, validam as interações do usuário, verificam a lógica do lado do cliente, garantem a compatibilidade entre navegadores e dispositivos, validam o design responsivo e evitam regressões. Os testes front-end contribuem para fornecer uma experiência de usuário de alta qualidade e livre de bugs em um projeto web.

<br>

### Contribuições Pessoais:
Neste projeto fui responsável pela organização da equipe, manejando o time para que tivéssemos tempo para aprender as novas tecnologias propostas;desenvolvimento da pipeline de execução tanto do front-end quanto do back-end, lidando com orquestações utilizando o GithubActions; desenvolvimento de testes unitários para o front-end.

<details><summary>Issue Control:</summary> 
 
O controle de problemas em um projeto DevOps refere-se ao gerenciamento e resolução de problemas ou dificuldades que surgem durante o desenvolvimento, implementação e operação contínua de um sistema ou software. Envolve a identificação proativa de problemas, registro e rastreamento de problemas, priorização, resolução, comunicação e aprendizado contínuo. O controle eficaz de problemas ajuda as equipes a identificar e resolver problemas rapidamente, melhorando a qualidade do software entregue e a satisfação do usuário.
Para controle de problemas neste projeto, utilizamos metodologias de documentação e integração entre softwares como base para documentação, em especial:

- Github -> Utilizamos o github para criar um quadro com as tarefas definidas para cada sprint, além de documentar cada uma delas como problemas dentro do github. O que nos permite criar atribuições desde a criação de um branch até o link nos commits. [Board link](https://github.com/orgs/PhatomFatec/projects/5/views/1) 

- [Zube](https://zube.io/) -> Utilizamos o zube em conjunto com o github, promovendo uma integração muito valiosa para documentação e controle de questões relacionadas a este projeto. Da aplicação da metodologia ágil utilizada

- Exemplo de material: [IssueControl](https://www.canva.com/design/DAFkSjejDHU/45xN9H1R4W8JAcRQjU4I_Q/edit?utm_content=DAFkSjejDHU&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

<br>

</details>

</details>
<details><summary>Orquestração utilizando GithubActions: </summary> 
 
```

name: Unit test back

on:
  push:
     branches: [ $default-branch ]
  pull_request:
    branches: [ main, develop ]

jobs:
  build-and-test:
    runs-on: ubuntu-latest
    steps:
    - uses: actions/checkout@v1
    - name: Set up JDK 17
      uses: actions/setup-java@v1
      with:
        java-version: '17'
    - name: run tests with Maven
      run: mvn test
```

<br>

</details>
</details>
<details><summary>Front-end test: </summary> 
 
```
describe('toHome', () => {
  test('deve mostrar a seção de home e esconder as outras', () => {
    document.body.innerHTML = `
    <div class="home"></div>
    `
    toHome()

    const home = document.querySelector('.home')

    expect(home.style.display).toBe('flex')

  })
})

```
<br>

</details>


## Aprendizados efetivos:

#### Soft Skills Desenvolvidas:

- **Gestão do Tempo:**
   - Enfrentei o desafio da organização do tempo, priorizando tarefas essenciais para o progresso do projeto.

- **Liderança:**
   - Como Scrum Master, liderei a equipe, guiando-a na adoção de tecnologias novas e na priorização eficiente de tarefas.

- **Comunicação Eficaz:**
   - Instruí a equipe, assegurando que compreendessem as metodologias de orquestração, CI/CD e unit-tests, promovendo uma comunicação clara e eficaz.

- **Orientação e Instrução:**
   - Instruí a equipe na implementação de metodologias de orquestração, garantindo o uso adequado de práticas como CI/CD e unit-tests.

#### Hard Skills Desenvolvidas:

| Hard Skill                                | Nota (0-10) |
|-------------------------------------------|-------------|
| Gestão de Tempo                           | 9           |
| Metodologias de Orquestração (CI/CD)      | 8           |
| GitHub Actions                            | 9           |
| Pipeline de Execução de Códigos           | 8           |
| Validações de Qualidade e Segurança      | 8           |


<br>

<br>


# Projeto 6: 2º Semestre de 2023

### Parceiro acadêmico: <a href="https://visionaespacial.com/">Visiona</a>

<details><summary>Logo da Empresa</summary>
<br><br>

<img src ="https://visionaespacial.com/wp-content/themes/VisionaEspacial/assets/img/logo-branca-completa.svg"/></details>

<br>

## Objetivo do projeto:

O Proagro é um programa governamental que financia atividades agrícolas de pequenos e médios produtores no Brasil. Ao participar, o produtor precisa fornecer detalhes sobre sua atividade agrícola e localização das áreas cultivadas. Esses dados são armazenados em tabelas e em um banco de dados. Além disso, informações sobre técnicas de cultivo, tipos de plantas, potencial de produção, dados de plantio e colheita são essenciais. O uso do sensoriamento remoto tem sido eficaz para o monitoramento das atividades agrícolas, e os dados do Proagro são valiosos para a criação de modelos de inteligência artificial baseados em informações obtidas por satélite. O desafio é apresentar esses dados de forma clara e intuitiva em um sistema de informação geográfica, combinando informações sobre as operações agrícolas e dados de sensoriamento remoto.

<br>

## Tecnologias Utilizadas:

### `Python` 

Python é uma linguagem de programação versátil e poderosa. Sua sintaxe clara e legível torna-a ideal tanto para iniciantes quanto para programadores experientes. Oferece uma ampla gama de bibliotecas e frameworks, permitindo o desenvolvimento em diversas áreas, desde aplicações web até inteligência artificial e análise de dados. Sua comunidade ativa contribui constantemente com novas bibliotecas e recursos, tornando-a uma das linguagens mais populares em vários domínios da computação.

<br>

### `Flask ` 

Flask é um framework web minimalista para Python, o que significa que oferece o mínimo necessário para criar aplicações web. Sua simplicidade e extensibilidade permitem que desenvolvedores construam aplicações web de forma rápida e eficiente. O Flask segue a filosofia de "faça você mesmo" (do inglês, "do it yourself") e é bastante flexível, permitindo a integração de outras bibliotecas e ferramentas conforme a necessidade do projeto.

<br>

### `Postgres ` 

O PostgreSQL, ou simplesmente Postgres, é um sistema de gerenciamento de banco de dados relacional (RDBMS) robusto e confiável. É conhecido por sua conformidade com os padrões SQL, suporte a transações ACID (Atomicidade, Consistência, Isolamento, Durabilidade) e por oferecer recursos avançados, como chaves estrangeiras, gatilhos, procedimentos armazenados e replicação. É amplamente utilizado em aplicações que requerem confiabilidade e integridade dos dados.

<br>

### `Postgis ` 

O PostGIS é uma extensão espacial para o PostgreSQL, permitindo que o banco de dados lide com dados geoespaciais. Ele adiciona suporte para objetos geográficos e permite consultas e análises espaciais avançadas. Com o PostGIS, é possível armazenar informações sobre localização, realizar cálculos de distância, consultar áreas específicas e realizar análises geoespaciais complexas.

<br>

### `MongoDB `

MongoDB é um banco de dados NoSQL orientado a documentos. Ele difere dos bancos de dados relacionais ao armazenar dados em documentos flexíveis (geralmente em formato JSON), em vez de tabelas. Isso permite uma escalabilidade mais simples e uma maior flexibilidade para lidar com dados não estruturados ou semiestruturados. O MongoDB é frequentemente utilizado em aplicações web e móveis, especialmente em casos onde a estrutura dos dados pode variar e crescer ao longo do tempo. Sua capacidade de replicação e distribuição também o torna adequado para ambientes de grande escala.

<br>

### Contribuições Pessoais:
Neste projeto fui responsável pelo desenvolvimento do back-end. Isso inclui: validação e verificação de qualidade dos dados, desenvolvimento de funções no python, criação de endpoints usando flask, lógica de login usando JWT. Também fui responsável pela estrutação de base de dados utilizando Postgres e Postgis para viablizar a leitura de dados de imagem da nossa base. Tratamento de dados e lógica de envio de informações através do HTTP. Criação de modelos de Machine Learning para previsão de séries temporais e verificação de situação de cada gleba(pedaço de terra).

<details><summary>Função de login e definição de rota e verificação de criptogafia:</summary> 

```
@app.route('/login', methods=['POST'])
def login(email_in=None, senha_in=None):
    
    if email_in != None or senha_in != None:
        email = email_in
        senha = senha_in
    else: 
        data = request.get_json()
        email = data.get('email')
        senha = data.get('senha')

    # email padrão -> admin@admin.com, senha padrão -> admin123
    User = user.query.filter_by(email=email).first()

    if User and bcrypt.checkpw(senha.encode('utf-8'), User.senha.encode('utf-8')):
        # Credenciais válidas, crie um token JWT
        access_token = create_access_token(identity=User.id)
        return jsonify({'access_token': access_token}), 200
    else:
        return jsonify({'message': 'Credenciais inválidas.'}), 401
```

<br>

</details>
<details><summary>Função utilizada para criação de modelo de previsão dos indices:</summary> 
	
```
previsoes = []

for ref_bacen in dados['ref_bacen'].unique():
    dados_ref = dados[dados['ref_bacen'] == ref_bacen]['indice']
    print(dados_ref)

    modelo = SARIMAX(dados_ref, order=(1, 1, 1), seasonal_order=(1, 1, 1, 12))
    resultado = modelo.fit()

    # Obter os próximos 6 passos de previsão a partir do próximo mês após a última data nos dados
    ultima_data = dados_ref.index[-1]
    proximas_datas_previsao = pd.date_range(start=ultima_data, periods=7, freq='M')[1:]

    previsao = resultado.get_forecast(steps=6)
    previsao_mean = previsao.predicted_mean
    
    previsao_df = pd.DataFrame({
        'date': proximas_datas_previsao,
        'ref_bacen': ref_bacen,
        'previsao': previsao_mean,
    })

    previsoes.append(previsao_df)

previsoes_df = pd.concat(previsoes)
```

</details>

<br> 

## Aprendizados efetivos:

# Aprendizados Efetivos de Projeto

#### Soft Skills Desenvolvidas:

Durante este projeto, algumas soft skills foram desenvolvidas e aplicadas:

- **Colaboração:**
   - Trabalhei diretamente no back-end, colaborando efetivamente com a equipe para atingir os objetivos do projeto.

- **Comunicação Efetiva:**
   - Facilitei a comunicação entre as equipes de desenvolvimento, contribuindo para a fluidez das tarefas e compreensão mútua.

- **Adaptabilidade:**
   - Ao aprender uma nova tecnologia (MongoDB), demonstrei adaptabilidade ao ambiente de desenvolvimento.

#### Hard Skills Desenvolvidas:

| Hard Skill                          | Nota (0-10) |
|-------------------------------------|-------------|
| Desenvolvimento em Flask            | 9           |
| Liberação de Login com JWT          | 8           |
| Desenvolvimento de Modelos de ML    | 7           |
| MongoDB                             | 8           |
| Integração Python e Flask           | 9           |
