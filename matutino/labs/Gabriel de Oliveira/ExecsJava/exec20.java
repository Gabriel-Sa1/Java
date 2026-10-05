package ExecsJava;

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
