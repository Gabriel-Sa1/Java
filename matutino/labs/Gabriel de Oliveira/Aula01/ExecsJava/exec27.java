package ExecsJava;

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
