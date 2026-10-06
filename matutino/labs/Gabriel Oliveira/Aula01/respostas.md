1. Qual é a diferença entre problema computacional, algoritmo e código-fonte?
    R1: Um problema computacional é algo a ser resolivdo com um computador tipo ordeanar uma lista. 
    Algorito é uma sequencias de instrucoes de forma que fique linear.
    Codigo-Fonte é o conjunto de intruções implementado em uma linguagem(algoritimo aplicado a uma linguagem).

2. Qual é o papel do compilador (javac) e da Máquina Virtual Java (JVM) na execução de um programa em Java?
    R2: 
    Javac Transformar um arquivo .Java em um bytecode bem dificil e entender.
    JVM compila o bytecode em linguagem de maquina.

3. Qual é o propósito do método `main` em Java?
    R3: É um start do progama, onde o codigo principal vai estar alocado.

4. Ordene: JVM, arquivo `.class`, `javac`, arquivo `.java`, programa em execução.
    R4: .java, javaC, .class, JVM e progama em execução

5. Qual é a diferença entre declarar e inicializar uma variável?
    R5: int a; é declarar um int e nao dar valor(inicializar) agr se fosse inta a = 5; ela teria sido inicialziada.

6. Por que Java é considerada uma linguagem "de tipagem forte"? Que diferença há na prática ao criar variáveis?
    R6: 

7. Defina o tipo de variável para: idade, altura, letra da turma, nome completo e status de matrícula.
    R7:String, float, char, String e String.

8. Explique porquê `char resposta = "S";` não compila e apresente duas correções.
    R9: "S" esta sobre aspas duplas, deveria ta em aspas simples.

9. Qual é a saída do código?

    ```java
    System.out.println("hii");
    System.out.print("world");
    System.out.println("!");
    ```
R9: hii
    world!


10. Qual é a saída do código?

   ```java
   int a = 5;
   int b = 2;
   System.out.println(a / b);
   ```
R10: 2

11. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + x + y);
    ```
R11: Resultado: 103


12. Qual é a saída do código?

    ```java
    int x = 10;
    int y = 3;
    System.out.println("Resultado: " + (x + y));
    ```
R12: Resultado: 13


13. Qual é a saída do código?

    ```java
    double a = 5 / 2;
    System.out.println(a);
    ```
R13: 2.0


14. Quais são os valores finais de `x` e `y`?

    ```java
    int x = 10;
    int y = x;
    x = 20;
    ```
R14: X: 20, Y: 10


15. Crie `OlaCurso.java`, com classe pública `OlaCurso` e exiba o nome do curso em duas linhas.
R15:public class OlaCurso {
    public static void main(String[] args){
        System.out.println("Monitoria");
        System.out.println("Java");
    }
}
*Arquivo no repo


16. Escreva um programa que declare nome, semestre e status de matrícula e exiba os dados com `printf`.
R16:
public class exec16 {
    public static void main(String[] args){
        //Escreva um programa que declare nome, semestre e status de matrícula e exiba os dados com `printf`.
        String nome = "Gabriel";
        String semestre = "Segundo";
        String status = "Matriculado";
        System.out.printf("Nome: %s, Semestre: %s e Semestre atual: %s", nome, semestre, status);
    }
}


17. Escreva um cartão de produto com descrição, código inteiro, preço, categoria e disponibilidade.
R17:
import java.util.Scanner;
public class exec17 {
    public static void main(String[] args){
        //Escreva um cartão de produto com descrição, código inteiro, preço, categoria e disponibilidade.
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a descricao do produto: ");
        String desc = sc.nextLine();

        System.out.println("Insira o código do produto: ");
        String codigo = sc.nextLine();
        int cod = Integer.parseInt(codigo);

        System.out.println("Insira o preco do produto: ");
        float preco = Float.parseFloat(sc.nextLine());

        System.out.println("Insira a categoria do produto: ");
        String categoria = sc.nextLine();

        System.out.println("insira se esta disponivel: ");
        String confira = sc.nextLine();

        System.out.println("A descricao do produto é: "+desc+" o produto custa: "+preco+"R$ sua categoria é: "+categoria+
                "seu codigo é: "+cod+" Está: "+
                confira);
        sc.close();
    }
}


18. Escreva um programa que leia dois números inteiros do usuário e exiba a soma, subtração e multiplicação entre eles.
R18:
import java.util.Scanner;
public class exec18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Insira o segundo valor: ");
        int num2 = sc.nextInt();
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        sc.close();
    }
}

19. Escreva um programa que leia o ano de nascimento de um usuário e o ano atual, calcula a idade aproximada da pessoa (sem considerar o mês)
R19:
import java.util.Scanner;
public class exec19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ano de nascimento: ");
        int nasce = sc.nextInt();
        System.out.println("Insira o ano atual: ");
        int atual = sc.nextInt();
        System.out.println("Voce tem: "+ (atual - nasce) + " anos");
        sc.close();
    }
}

20. Declare uma constante para o valor de PI. Leia o raio de um círculo e calcule a área.
import java.util.Scanner;
public class exec20 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Insira um raio de uma circuferencia: ");
        float raio = sc.nextFloat();

        System.out.println("A area da circuferencia é de: "+ (pi * (raio * raio)));
    }
}

21. Escreva um programa que leia um número inteiro e exiba se o valor é maior que 100.
R21:
import java.util.Scanner;
public class exec21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 100){
            System.out.println("É maior que 100");
        }
        else {
            System.out.println("Nao é maior que 100");
        }
        sc.close();
    }
}


22. Leia uma temperatura em °C (Celsius) e converta para °F (Fahrenheit).
R22:
import java.util.Scanner;
public class exec22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        System.out.println(1.8 * c + 32);
        sc.close();
    }
}


23. Leia três notas de um aluno e seus respectivos pesos. Calcule e exiba a média ponderada.
R23:
import java.util.Scanner;
public class exec23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a primeira nota: ");
        float primeiro = sc.nextFloat();
        System.out.println("insira o peso da nota: ");
        int peso1 = sc.nextInt();

        System.out.println("insira a segunda nota: ");
        float segundo = sc.nextFloat();
        System.out.println("insira o peso da nota: ");
        int peso2 = sc.nextInt();

        System.out.println("insira a terceira nota: ");
        float terceiro = sc.nextFloat();
        System.out.println("insira o peso da nota: ");
        int peso3 = sc.nextInt();

        float media = ((primeiro * peso1) + (segundo * peso2) + (terceiro * peso3)) / (peso1 + peso2 + peso3);
        System.out.println(media);
        sc.close();
    }
}


24. Leia um valor inteiro em reais que um usuário deseja sacar. Supondo que o caixa só tem notas de R$50, exiba quantas notas ele receberá e qual é o valor do "troco" que não pode ser sacado.
R24:
import java.util.Scanner;
public class exec24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor em real: ");
        int cont = 0;

        float R = sc.nextFloat();
        while(R >= 50){
            cont ++;
            R = R - 50;
        }

        System.out.println("Ele recebera: "+ cont+ " notas de 50 e "+R+" de troco");
        sc.close();
    }
}


25. Leia uma temperatura e armazene em três variáveis (booleanas) se `temperatura < 0`, `temperatura == 0` e `temperatura > 30`. Exiba os dados. Não use `if`.
R25:
import java.util.Scanner;
public class exec25 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma temperatura: ");
        float temp = sc.nextFloat();

        boolean AbaixoZero = temp < 0;
        boolean IgualZero = temp == 0;
        boolean Acima30 = temp > 30;

        System.out.println("Abaixo de zero: "+ AbaixoZero);
        System.out.println("Igual a zero: "+ IgualZero);
        System.out.println("Acima de 30: "+ Acima30);

        sc.close();
    }
}

26. Leia um número inteiro representando uma quantidade total de segundos. Converta esse valor para horas, minutos e segundos.
R26:
import java.util.Scanner;
public class exec26 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int contH = 0;
        int contM = 0;
        // Leia um número inteiro representando uma quantidade total de segundos.
        // Converta esse valor para horas, minutos e segundos.
        System.out.println("Insira uma quantidade de segundos: ");
        int seg = sc.nextInt();


        while (seg >= 3600){
            contH ++;
            seg = seg - 3600;
        }
        while(seg >= 60){
            contM ++;
            seg = seg - 60;
        }

        System.out.println(+contH+" Horas "+contM+" Minutos "+seg+" segundos");
        sc.close();
    }
}

27. Leia um número inteiro de dois dígitos. Extraia a dezena e a unidade e exiba o número invertido.
R27:
import java.util.Scanner;
public class exec27 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int cont = 0;
        
        System.out.println("Insira um valor inteiro: ");
        int inteiro = sc.nextInt();


        if (inteiro < 100){
            while (inteiro >= 10){
                cont ++;
                inteiro = inteiro - 10;
            }
            System.out.print(inteiro);
            System.out.print(cont);
        }
        else {
            System.out.println("Valor com mais de dois digitos");
        }
        sc.close();
    }
}

28. Identifique o erro, explique o motivo e reescreva o código com a correção.

    ```java
    // o objetivo é calcular a porcentagem de aprovação

    int totalAlunos = 25;
    int alunosAprovados = 15;
    double taxaAprovacao = alunosAprovados / totalAlunos;
    System.out.println("Taxa de aprovação: " + taxaAprovacao);
    ```
R28:
import java.util.Scanner;
public class exec28 {
    public static void main(String[] args){
        //O problema do código é que o totalAlunos e alunosAprovados eram int e o int
        //não tem espaço na memoria para numeros depois da virgula printando so 0 alem de 0.6
        Scanner sc = new Scanner(System.in);
        double totalAlunos = 25;
        double alunosAprovados = 15;
        double taxaAprovacao = alunosAprovados / totalAlunos;
        System.out.println("Taxa de aprovação: " + taxaAprovacao);
        sc.close();
    }
}
