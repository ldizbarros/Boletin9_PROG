package boletin9_3;

import java.util.Scanner;

/**
 * Implementa un programa que calcule o área dun rectángulo cuxa base e altura
 * pides por teclado. 
 * Asegurate que estos valores sexan positivos , para eso valida os datos .
 */
public class Boletin9_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base,altura;
        
        do{
            System.out.println("Introduzca la base del rectangulo:");
            base = sc.nextDouble();
            System.out.println("Introduzca la altura del rectangulo:");
            altura = sc.nextDouble();
        }while(base<=0 || altura<=0);
        
        
        Clase9_3 c1 = new Clase9_3(base,altura);
        c1.calcularArea();
    }
}
