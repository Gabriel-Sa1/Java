package ExecsJava;

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
