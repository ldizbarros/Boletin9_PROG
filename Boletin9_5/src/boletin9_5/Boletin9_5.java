package boletin9_5;

import java.util.Scanner;

/** Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
 *  a)  2 + 4 + 6 + 8 + 10 …..
 *  b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
 *  c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………
 */
public class Boletin9_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op=0;
        
        do{
            System.out.println("****** ELIGE UNA SERIE ******");
            System.out.println("1)Serie Numeros Pares \n2)Serie Numeros Neg/Pos \n3)Sere Fibonacci\n4)Salir \n");
            System.out.print("----->   ");
            op = sc.nextInt();
            switch (op){
                case 1: System.out.println("Introduzca el numero de repeticiones:");
                    int num = sc.nextInt();
                    Clase9_5 c1 = new Clase9_5(num);
                    c1.mostrarSerie1();
                    break;
                case 2: System.out.println("Introduzca el numero de repeticiones:");
                    int num2 = sc.nextInt();
                    Clase9_5 c2 = new Clase9_5(num2);
                    c2.mostrarSerie2();
                    break;
                case 3: System.out.println("Introduzca el numero de repeticiones:");
                    int num3 = sc.nextInt();
                    Clase9_5 c3 = new Clase9_5(num3);
                    c3.mostrarSerie3();
                    break;
                case 4: break;
                default: System.out.println("La opcion introducida no es valida");
            }
        }while (op!=4);
       
    }
    
}
