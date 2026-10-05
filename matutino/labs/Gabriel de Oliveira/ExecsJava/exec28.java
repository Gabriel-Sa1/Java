package ExecsJava;

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
