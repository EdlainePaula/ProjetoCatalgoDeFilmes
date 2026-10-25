# Módulo de Fundamentos de Java — Evolução dos Exercícios

Projeto de estudos desenvolvido em **Java 27**, com foco na evolução gradual dos conceitos: de variáveis e operações simples até orientação a objetos, tratamento de erros e um programa interativo.

## Objetivo

Registrar **o que foi feito em cada atividade**, quais conceitos foram praticados e como cada etapa prepara a próxima. Os exercícios foram organizados no package `exercicios`, com uma classe por assunto e uma única `Main.java` que chama os métodos `executar()` em sequência.

## Estrutura do projeto

```text
ProjetoJava27/
└── src/
    └── exercicios/
        ├── Main.java
        ├── Variaveis.java
        ├── Operadores.java
        ├── Concatenacao.java
        ├── EntradaDados.java
        ├── Condicionais.java
        ├── Loops.java
        ├── Arrays.java
        ├── Strings.java
        ├── ClassesObjetos.java
        ├── Pet.java
        ├── Produto.java
        ├── Aluna.java
        ├── Jogadora.java
        ├── Metodos.java
        ├── Excecoes.java
        ├── Filme.java
        └── CatalogoFilmes.java
```

## Evolução do módulo — atividades realizadas

### 1. Variáveis e tipos (`Variaveis.java`)

1. Declaradas e exibidas variáveis de **nome, idade, altura e experiência prévia com programação** (`String`, `int`, `double` e `boolean`).
2. Criada uma variável para a **cidade**, utilizada na frase “Eu moro em Salvador.”.
3. Combinados **primeiro nome e sobrenome** para exibir o nome completo.
4. Criado um **preço de R$ 29,90**, exibido em uma frase.
5. Declarada a variável booleana **temCarteira** com valor `true`.
6. **Mini-desafio:** trocados os valores de `a` e `b` usando uma terceira variável, sem repetir os números na atribuição.

**Aprendizado:** armazenar informações, escolher tipos e atualizar valores.

### 2. Operadores (`Operadores.java`)

1. Calculadas **soma, subtração, multiplicação, divisão inteira e resto** com dois números.
2. Atualizado um **saldo** usando os operadores `+=` e `-=`.
3. Comparados dois valores com `==`, `!=`, `>` e `>=`.
4. Combinadas as condições **idade mínima e carteira de motorista** com `&&`.
5. Calculado o **resto da divisão por 2**.
6. Calculado o valor de **três pacotes de arroz**.
7. **Mini-desafio:** verificado se um número é divisível por **3 e 5 simultaneamente**, sem `if`.

**Aprendizado:** realizar cálculos e produzir condições booleanas.

### 3. Concatenação e `printf` (`Concatenacao.java`)

1. Montada uma frase com **nome e idade** por concatenação.
2. Calculada a **média de duas notas**, com duas casas decimais.
3. Exibido um **preço formatado** com duas casas decimais.
4. Mostrados **nome, idade e altura na mesma linha** com `printf`.
5. **Mini-desafio:** criado um **recibo com três produtos e total acumulado**.

**Aprendizado:** produzir saídas legíveis e formatar valores numéricos.

### 4. Entrada de dados com `Scanner` (`EntradaDados.java`)

1. Solicitado o **nome** e exibida uma saudação.
2. Solicitada a **idade** e calculada a idade no próximo aniversário.
3. Solicitados **dois números** e exibida a soma.
4. Solicitados **altura e peso**, apresentados em uma frase.
5. **Mini-desafio:** montada uma **ficha com idade, nome e cidade**, limpando a quebra de linha após `nextInt()`.

**Aprendizado:** receber dados do usuário e alternar corretamente entre leituras numéricas e textuais.

### 5. Condicionais (`Condicionais.java`)

1. Identificado se a pessoa é **maior ou menor de idade**.
2. Identificado se um número é **par ou ímpar**.
3. Comparados dois números para informar **qual é maior ou se são iguais**.
4. Classificada uma nota como **aprovada, recuperação ou reprovada**.
5. Criado um **menu de sabores de sorvete** com `switch`.
6. Calculado o **preço do ingresso conforme a idade**.
7. **Mini-desafio:** classificados triângulos como **equilátero, isósceles ou escaleno**, incluindo verificação de lados inválidos.

**Aprendizado:** controlar decisões usando `if`, `else`, operadores lógicos e `switch`.

### 6. Repetições (`Loops.java`)

1. Impressos os números de **1 a 20** com `for`.
2. Criada uma **contagem regressiva de 10 a 1**.
3. Gerada a **tabuada de um número informado pelo usuário**.
4. Impressos apenas os **números pares de 1 a 30**.
5. Somados os números de **1 a 100**.
6. Repetida a contagem de 1 a 20 usando **`while`**.
7. Simulada uma energia decrescente usando **`do-while`**.
8. **Mini-desafio:** desenhado um **triângulo de asteriscos** com laços aninhados.

**Aprendizado:** automatizar tarefas repetitivas e controlar condições de parada.

### 7. Arrays (`Arrays.java`)

1. Criado um **array de cinco nomes**, com acesso ao primeiro, terceiro e último.
2. Percorrido um **array de notas** usando um laço.
3. Calculadas a **soma e a média das notas**.
4. Encontrado o **maior número** de um array.
5. Contadas as **notas maiores ou iguais a 7**.
6. **Mini-desafio:** buscado um nome no array e informada sua **posição ou ausência**, usando `-1` como marcador inicial.

**Aprendizado:** armazenar conjuntos de valores e percorrê-los com índices e laços.

### 8. Strings (`Strings.java`)

1. Lido um **nome completo** e calculado seu número de caracteres.
2. Exibido o nome em **maiúsculas e minúsculas**.
3. Obtida a **primeira letra** do nome.
4. Verificado se uma **palavra aparece em uma frase**.
5. Comparados dois nomes **ignorando diferenças entre maiúsculas e minúsculas**.
6. Removidos espaços nas pontas e convertido o nome para **maiúsculas**, encadeando métodos.
7. **Mini-desafio:** verificado se uma palavra **começa e termina com a mesma letra**, ignorando maiúsculas.

**Aprendizado:** manipular e comparar textos com métodos da classe `String`.

### 9. Classes e objetos (`ClassesObjetos.java`, `Pet.java`, `Produto.java`, `Aluna.java`, `Jogadora.java`)

1. Criada a classe **`Pet`**, com nome, raça e peso; instanciado e preenchido um objeto.
2. Criados **dois pets diferentes**, com fichas independentes.
3. Criada a classe **`Produto`**, com cálculo do **valor total em estoque**.
4. Criada a classe **`Aluna`**, com duas notas, cálculo de **média** e ficha.
5. **Mini-desafio:** criadas **três jogadoras**, comparadas suas pontuações e exibido o nome da vencedora.

**Aprendizado:** representar entidades por classes e criar objetos com estados próprios. Nesta etapa, os atributos são acessados diretamente para exercitar o básico de objetos.

### 10. Métodos (`Metodos.java`)

1. Criado e chamado **`mostrarBoasVindas()`**.
2. Criado **`saudacao(String nome)`**, chamado com três nomes.
3. Criado **`dobro(int numero)`**, com retorno numérico.
4. Criado **`calcularMedia(double n1, double n2)`**, com resultado formatado.
5. Criado **`ehPar(int numero)`**, que retorna `boolean` e é usado em uma condição.
6. Criadas duas versões de **`somar()`**, demonstrando **sobrecarga** com dois ou três parâmetros.
7. **Mini-desafio:** criado **`ehMaiorDeIdade()`**, reutilizado por **`liberarEntrada()`**.

**Aprendizado:** organizar comportamentos em métodos, reutilizar lógica e trabalhar com parâmetros e retornos.

### 11. Tratamento de exceções (`Excecoes.java`)

1. Tratada a **divisão por zero** com `ArithmeticException`.
2. Tratado o acesso a uma **posição inválida de array**.
3. Tratada a digitação de **texto no lugar da idade numérica**.
4. Tratada a tentativa de usar **`length()` em uma referência `null`**.
5. Demonstrado que o programa **continua funcionando** após tratar um acesso inválido a array.
6. **Mini-desafio:** criado um `try` com **três `catch` diferentes**: divisão por zero, índice inválido e exceção genérica.

**Aprendizado:** identificar falhas esperadas, tratá-las e evitar encerramentos inesperados.

### 12. Desafio final — Meu Catálogo de Filmes (`Filme.java` e `CatalogoFilmes.java`)

Criado um programa de console que reúne os principais conteúdos anteriores:

1. **Cadastrar filme:** recebe título, gênero e nota; converte o gênero para maiúsculas e calcula a classificação automaticamente (`Ótimo`, `Bom` ou `Ruim`).
2. **Listar filmes:** mostra os registros com gênero, nota e classificação.
3. **Buscar por título:** pesquisa sem diferenciar letras maiúsculas e minúsculas.
4. **Estatísticas:** informa quantidade de filmes, média das notas, melhor filme e quantidade de filmes classificados como `Ótimo`.
5. **Sair:** encerra o menu com uma mensagem de despedida.
6. **Validações:** impede cadastrar mais de **cinco filmes**, rejeita notas fora de **0 a 10** e trata letras digitadas no menu.

**Aprendizado:** integrar **arrays, contadores, objetos, construtores, atributos privados, getters, métodos, `Scanner`, `switch`, `while`, `printf` e exceções** em um mesmo programa.

> O catálogo usa um array fixo de cinco posições: os dados permanecem apenas enquanto o programa está em execução. Não há banco de dados ou persistência em arquivo nesta versão.

## Como executar

1. Abra a pasta do projeto no **IntelliJ IDEA**.
2. Configure o **JDK 27** (ou uma versão compatível com os recursos de linguagem utilizados).
3. Abra `src/exercicios/Main.java`.
4. Execute o método `main()`.
5. Responda às solicitações no console. Ao final dos assuntos, será aberto o menu do catálogo de filmes.

A `Main` compartilha um único `Scanner` com as classes que precisam ler dados e o fecha ao término da execução.

## Linha de evolução dos conhecimentos

```text
Variáveis e tipos
    ↓
Operadores e cálculos
    ↓
Concatenação e formatação
    ↓
Entrada de dados
    ↓
Condicionais e decisões
    ↓
Loops e repetições
    ↓
Arrays e buscas
    ↓
Manipulação de Strings
    ↓
Classes e objetos
    ↓
Métodos e reutilização
    ↓
Tratamento de exceções
    ↓
Catálogo de filmes (integração dos conhecimentos)
```

## Conclusão

O módulo começa com a declaração de dados e a impressão de resultados, evolui para decisões, repetições e coleções, introduz a organização em classes e métodos e termina com um programa interativo. O **Catálogo de Filmes** demonstra a aplicação conjunta desses conceitos e serve como ponto de partida para futuros estudos de **encapsulamento mais aprofundado, coleções dinâmicas, persistência e arquitetura de aplicações**.
