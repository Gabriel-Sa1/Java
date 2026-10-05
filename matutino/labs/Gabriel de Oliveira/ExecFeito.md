# Assignment

## Aula I

1. Qual é a diferença entre problema computacional, algoritmo e código-fonte?

2. Qual é o papel do compilador (javac) e da Máquina Virtual Java (JVM) na execução de um programa em Java?

3. Qual é o propósito do método `main` em Java?

4. Ordene: JVM, arquivo `.class`, `javac`, arquivo `.java`, programa em execução.

5. Qual é a diferença entre declarar e inicializar uma variável?

6. Por que Java é considerada uma linguagem "de tipagem forte"? Que diferença há na prática ao criar variáveis?

7. Defina o tipo de variável para: idade, altura, letra da turma, nome completo e status de matrícula.

8. Explique porquê `char resposta = "S";` não compila e apresente duas correções.

9. Qual é a saída do código?

    ```java
    System.out.println("hii");
    System.out.print("world");
    System.out.println("!");
    ```

10. Qual é a saída do código?

   ```java
   int a = 5;
   int b = 2;
   System.out.println(a / b);
   ```

11. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + x + y);
    ```

12. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + (x + y));
    ```

13. Qual é a saída do código?

    ```java
    double a = 5 / 2;
    System.out.println(a);
    ```

14. Quais são os valores finais de `x` e `y`?

    ```java
    int x = 10;
    int y = x;
    x = 20;
    ```

15. Crie `exec15`, com classe pública `exec15` e exiba o nome do curso em duas linhas.

16. Escreva um programa que declare nome, semestre e status de matrícula e exiba os dados com `printf`.

17. Escreva um cartão de produto com descrição, código inteiro, preço, categoria e disponibilidade.

18. Escreva um programa que leia dois números inteiros do usuário e exiba a soma, subtração e multiplicação entre eles.

19. Escreva um programa que leia o ano de nascimento de um usuário e o ano atual, calcula a idade aproximada da pessoa (sem considerar o mês)

20. Declare uma constante para o valor de PI. Leia o raio de um círculo e calcule a área.

21. Escreva um programa que leia um número inteiro e exiba se o valor é maior que 100.

22. Leia uma temperatura em °C (Celsius) e converta para °F (Fahrenheit).

23. Leia três notas de um aluno e seus respectivos pesos. Calcule e exiba a média ponderada.

24. Leia um valor inteiro em reais que um usuário deseja sacar. Supondo que o caixa só tem notas de R$50, exiba quantas notas ele receberá e qual é o valor do "troco" que não pode ser sacado.

25. Leia uma temperatura e armazene em três variáveis (booleanas) se `temperatura < 0`, `temperatura == 0` e `temperatura > 30`. Exiba os dados. Não use `if`.

26. Leia um número inteiro representando uma quantidade total de segundos. Converta esse valor para horas, minutos e segundos.

27. Leia um número inteiro de dois dígitos. Extraia a dezena e a unidade e exiba o número invertido.

28. Identifique o erro, explique o motivo e reescreva o código com a correção.

    ```java
    // o objetivo é calcular a porcentagem de aprovação

    int totalAlunos = 25;
    int alunosAprovados = 15;
    double taxaAprovacao = alunosAprovados / totalAlunos;
    System.out.println("Taxa de aprovação: " + taxaAprovacao);
    ```