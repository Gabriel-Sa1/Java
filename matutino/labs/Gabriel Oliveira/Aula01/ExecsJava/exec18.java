package ExecsJava;

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