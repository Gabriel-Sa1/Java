package ExecsJava;

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