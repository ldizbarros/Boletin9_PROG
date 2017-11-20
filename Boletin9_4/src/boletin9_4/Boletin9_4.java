package boletin9_4;

import java.util.Scanner;

public class Boletin9_4 {
    
    /**
    * Codifica un programa que solicite  un número e, visualice a táboa de 
    * multiplicar dese número. O programa rematara cando prememos o cero.
    **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el numero de la tabla de multiplicar:");
        int num = sc.nextInt();
        
        while(num!=0){
            Clase9_4 c1 = new Clase9_4(num);
            c1.tablaMultiplicar();
            System.out.println("Introduzca el numero de la tabla de multiplicar:");
            num = sc.nextInt();
        }
    }
    
}
