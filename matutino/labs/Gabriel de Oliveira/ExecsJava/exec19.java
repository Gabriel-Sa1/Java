package ExecsJava;

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
