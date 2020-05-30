# Anotações

Aqui, estão algumas anotações que faço durante os estudos. Neste arquivo compartilho algumas dicas e conceitos relacionadas ao que estou estudando. Fique à vontade para ler e contribuir enviando *feedback* para [meu perfil no LinkedIn](https://www.linkedin.com/in/di%C3%B3genes-chagas-604386bb/).
**IMPORTANTE**: Este documento é passível de revisão. Portanto, caso encontre alguma inconsistência (conceito ou dica equivocados) fique à vontade para corrigir. A ideia é colaborar, **SEMPRE!** 😉

## Capturando dados do teclado

**Passo 1:** 
Você pode utilizar a  classe *Scanner* juntamente com a classe *System* que através do método *in* vai identificar o que de fato o programa irá ler: Os dados de entrada do seu teclado. Como o próprio nome sugere, ele vai **"scannear"** (ler) os dados informados. Exemplo:

`Scanner scanner = new Scanner (System.in);`

**DICA:** É interessante você começar com um título. Até mesmo para você mostrar seu programa para outras pessoas. Já imaginou você mostrar seu programa para sua mãe, seu pai ou namorada (sei lá! 😜) e eles simplesmente se depararem com apenas uma linha "`Digite um valor:`". Por isso após instanciar o *Scanner*, imprima uma mensagem na tela informando do que se trata aquele programa. Exemplo:

`System.out.println("Programa de Calculo do IMC");`

**Já adiantando:** este trecho informa o que será "impresso" como saída na tela, por isso o *out*

**Passo 2: Criando variáveis e armazenando os valores**
Sabemos que o que você digitar deve ser guardado em algum lugar, então para a criação de variáveis e atribuição de valores, faço da seguinte forma:

`double valor;`
`System.out.println("Informe o valor: ");`
`valor = scanner.nextDouble();`

**Nota:** Eu coloco a variável separada do *scanner* por questão de escolha. Mas a atribuição pode ser feita diretamente. Exemplo: 

`System.out.println("Informe o valor: ");`
`double valor = scanner.nextDouble();`

**Importante:** Você deve utilizar o método `scanner.next` de acordo com o tipo de dado que vai armazenar na variável como demonstrado na tabela abaixo:
|                |TIPO                          |CHAMADA                         |
|----------------|-------------------------------|-----------------------------|
|Números inteiros|`int`            |`nextInt()`            |
|Números reais          |`double`            |`nextDouble()`            |
|Texto          |`String`|`nextLine()` ou `next()`|

## Operadores Lógicos
### -- Porque devo usar `&&` e `||`? 
A diferença substancial é que no caso do `&&` quando for verificar as varáveis que estão sendo comparadas, caso a primeira atenda a condição, ele ignora a outra variável, pois não há necessidade de checagem. O que não ocorre quando você utiliza os operadores: `&` e `|`.

## Switch case: Seu código sem ninhos

Uma alternativa que evita que seu código fique "aninhado" com vários `if` e `else`. Digamos que em um programa que você queira receber números de 1 à 7 atribuindo aos dias da semana, e assim, retornar se o **dia é útil** ou **fim de semana**. Para isso, se fôssemos utilizar `if` e `else` teríamos que fazer várias comparações. Por isso que neste caso é aconselhável utilizar o `Switch case`. Como sua estrutura é um pouco diferente do `if` e `else`, para que me lembre facilmente da sua estrutura eu faço o seguinte:

--Switch
-- Cases (casos)
--Default (padrão) --> Ele age como uma resposta padrão para o que não está dentro dos `cases`. 
**Importante:** A cada bloco de condições, o comando `break` deve ser acionado no do bloco. Caso isso não aconteça, todos os blocos serão executados até que o `break` seja encontrado.  😉

Você pode ver um exemplo de código utilizando o `Switch case` [clicando aqui](https://github.com/DioChagas/cursoJava/blob/master/teste/src/main/java/br/com/teste/AulaSwitchCase.java)


## E agora?
Para saber quais serão os próximos passos, [clique aqui](https://github.com/DioChagas/cursoJava/blob/master/README.md).
