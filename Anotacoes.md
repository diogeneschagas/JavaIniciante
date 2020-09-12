# Anotações

Aqui, estão algumas anotações que faço durante os estudos. Neste arquivo compartilho algumas dicas e conceitos relacionadas ao que estou estudando. Fique à vontade para ler e contribuir enviando *feedback* para [meu perfil no LinkedIn](www.linkedin.com/in/diogeneschagas).


**IMPORTANTE**: Este documento é passível de revisão. Portanto, caso encontre alguma inconsistência (conceito ou dica equivocados) fique à vontade para corrigir. A ideia é colaborar, **SEMPRE!** 😉

## Índice:

- [Capturando dados do teclado](#capturando-dados-do-teclado)
- [Operadores Lógicos](#operadores-lógicos)
- [Switch Case](#switch-case)
- [Laços de repetição](#laços-de-repetição)
- [Anotações de exercícios](#exercícios)
## Capturando dados do teclado

**Passo 1:**
<br>
Você pode utilizar a  classe *Scanner* juntamente com a classe *System* que através do método *in* vai identificar o que de fato o programa irá ler: Os dados de entrada do seu teclado. Como o próprio nome sugere, ele vai **"scannear"** (ler) os dados informados. Exemplo:

`Scanner scanner = new Scanner (System.in);`

**DICA:** É interessante você começar com um título. Até mesmo para você mostrar seu programa para outras pessoas. Já imaginou você mostrar seu programa para sua mãe, seu pai ou namorada (sei lá! 😜) e eles simplesmente se depararem com apenas uma linha "`Digite um valor:`". Por isso após instanciar o *Scanner*, imprima uma mensagem na tela informando do que se trata aquele programa. Exemplo:

`System.out.println("Programa de Calculo do IMC");`

**Já adiantando:** este trecho informa o que será "impresso" como saída na tela, por isso o *out*

**Passo 2: Criando variáveis e armazenando os valores**
<br>
Sabemos que o que você digitar deve ser guardado em algum lugar, então para a criação de variáveis e atribuição de valores, faço da seguinte forma:

`double valor;` <br>
`System.out.println("Informe o valor: ");` <br>
`valor = scanner.nextDouble();`

**Nota:** Eu coloco a variável separada do *scanner* por questão de escolha. Mas a atribuição pode ser feita diretamente. Exemplo: 

`System.out.println("Informe o valor: ");` <br>
`double valor = scanner.nextDouble();`

**IMPORTANTE:** Você deve utilizar o método `scanner.next` de acordo com o tipo de dado que vai armazenar na variável como demonstrado na tabela abaixo:
|                  | TIPO     | CHAMADA                  |
|------------------|----------|--------------------------|
| Números inteiros | `int`    | `nextInt()`              |
| Números reais    | `double` | `nextDouble()`           |
| Texto            | `String` | `nextLine()` ou `next()` |

## Operadores Lógicos
### Porque devo usar `&&` e `||`? 
A diferença substancial é que no caso do `&&` quando for verificar as varáveis que estão sendo comparadas, caso a primeira atenda a condição, ele ignora a outra variável, pois não há necessidade de checagem. O que não ocorre quando você utiliza os operadores: `&` e `|`.

## Switch case
#### Seu código sem ninhos

Uma alternativa que evita que seu código fique "aninhado" com vários `if` e `else`. Digamos que em um programa que você queira receber números de 1 à 7 atribuindo aos dias da semana, e assim, retornar se o **dia é útil** ou **fim de semana**. Para isso, se fôssemos utilizar `if` e `else` teríamos que fazer várias comparações. Por isso que neste caso é aconselhável utilizar o `Switch case`. Como sua estrutura é um pouco diferente do `if` e `else`, para que me lembre facilmente da sua estrutura eu faço o seguinte:

- Switch <br>
- Cases (casos) <br>
- Default (padrão) --> Ele age como uma resposta padrão para o que não está dentro dos `cases`. 

**IMPORTANTE:** A cada bloco de condições, o comando `break` deve ser acionado no do bloco. Caso isso não aconteça, todos os blocos serão executados até que o `break` seja encontrado.  😉

Você pode ver um exemplo de código utilizando o `Switch case` [clicando aqui](https://github.com/DioChagas/cursoJava/blob/master/teste/src/main/java/br/com/teste/AulaSwitchCase.java)

## Laços de Repetição 
#### *While, do While e For*

Estruturas de repetição são muito comuns em sistemas sejam eles complexos ou não. Para controlar o fluxo de repetição nas aplicações, utilizamos as estruturas: *While, do While e For*. Mas, qual a diferença entre eles? Quando e como posso utilizar cada um? A seguir, uma tabela informativa sobre as principais características de cada um deles. 


| LAÇO       | PRINCIPAL CARACTERÍSTICA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
|------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `while`    | Sua principal característica é que **antes** de executar determinado bloco de  código existe um critério de aceitação (uma espécie de "barreira"). Ou seja, uma condição que deve ser satisfeita. Para ver um exemplo de código utilizando o comando `while` [clique aqui](https://github.com/DioChagas/cursoJava/blob/master/teste/src/main/java/br/com/teste/AulaWhile.java)                                                                                                                                                                                                                                                                                                                                                                 |
| `do while` | Diferentemente do laço `while`, esta estrutura define primeiro a **execução** do bloco de código para que somente **depois** da execução realizar a verficação. Para um exemplo mais didático, apliquei o laço `do while` no mesmo programa que utilizei o laço `while`. Você pode acessá-lo [clicando aqui](https://github.com/DioChagas/cursoJava/blob/master/teste/src/main/java/br/com/teste/AulaDoWhile.java)                                                                                                                                                                                                                                                                                                                             |
| `for`      | Nessa estrutura de repetição há algumas peculiaridades: Você pode definir o valor inicial da variável que vai determinar quantas vezes determinado bloco de código será utilizado (geralmente definida por `i`. Exemplo: `int i = 0`); em seguida, você pode inserir a condição de parada (exemplo: `i < 5`); e por fim, pode incrementar ou decrementar a variável (seguindo a lógica dos exemplos anteriores: `i++`). Contudo, essa estrutura não é a única que podemos utilizar para o laço `for`. Para fins didáticos, fiz **três exemplos de como podemos utilizar o laço `for`**. Tudo em um só arquivo!😁 Para acessar, [clique aqui](https://github.com/DioChagas/cursoJava/blob/master/teste/src/main/java/br/com/teste/AulaFor.java) |

## Exercícios 
#### *Escondendo caracteres utilizando o `console.readPassword()`*
Em um dos exercícios sobre comandos de repetição, era pedido um programa em fosse possível o cadastro de usuário e senha (claro, sem persistência de dados). Em que não fosse possível criar o usuário caso a senha fosse igual ao *login*. Fiz o programa, porém achei que faltava algo: ocultar os caracteres da senha. 
<br><br>
Para ocultar a digitação da **senha** descobri que teria que ir além. A seguir os passos que segui.

- **1)** utilizar tipos de dados diferentes para os valores de `usuário` e `senha`, respectivamente

|         | TIPO DE DADO                      | MÉTODO INVOCADO           |
|---------|-----------------------------------|---------------------------|
| USUÁRIO | `String` ~~> texto comum          | `scanner.nextLine();`     |
| SENHA   | `char[]` ~~> cadeia de caracteres | `console.readPassword();` |


- **2)** após a atribuição de váriáveis, o objetivo era comparar os valores do `username` com o `password` **(lembrando a regra de negócio do programa: ambos não poderiam ser iguais)**. Para tanto, tive que fazer uma conversão do tipo de dado da cadeia de caracteres `char[]` **(senha)** para `String` (Pois é. Em programação, geralmente você terá problemas ao tentar comparar tipos de dados distintos 😄).Segue o exemplo:
<br><br>
```java
    String username;
    char[] password;
    String pwordAsString;
        ...
        // Conversão utilizando o método 'copyValueOf'
    pwordAsString = String.copyValueOf(password);
        ...
```

- **3)** Realizar, finalmente, a validação dos valores de **usuário** e **senha**. Para isso, utilizei o método `equals()`. Pelo menos isso é o que se usa quando desejamos comparar `Strings`. 😄
<br><br>
Exemplo:

```java
    variavelUm.equals(variavelDois)
    
```
Para consulta, o código deste exercício encontra-se [aqui](https://github.com/DioChagas/cursoJava/blob/master/teste/src/main/java/br/com/teste/QuestoesPt3.java). (Vê lá e dá feedback 😄)
<br>

## E agora? O que vem por aí?
Para saber quais serão os próximos passos, [clique aqui](https://github.com/DioChagas/cursoJava/blob/master/README.md#primeiros-passos).
