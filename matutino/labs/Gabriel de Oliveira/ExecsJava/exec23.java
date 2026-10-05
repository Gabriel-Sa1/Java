package ExecsJava;

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