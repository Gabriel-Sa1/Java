package ExecsJava;

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