package boletin9_5;

import java.util.Scanner;

/** Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
 *  a)  2 + 4 + 6 + 8 + 10 …..
 *  b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
 *  c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………
 */
public class Boletin9_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcionMenu=0;
        
        do{
            System.out.println("****** ELIGE UNA SERIE ******");
            System.out.println("1)Serie Numeros Pares \n2)Serie Numeros Neg/Pos \n3)Sere Fibonacci\n4)Salir \n");
            System.out.print("----->   ");
            opcionMenu = scanner.nextInt();
            switch (opcionMenu){
                case 1: System.out.println("Introduzca el numero de repeticiones:");
                    int rep = scanner.nextInt();
                    Clase9_5 serie1 = new Clase9_5(rep);
                    serie1.mostrarSeriePares();
                    break;
                case 2: System.out.println("Introduzca el numero de repeticiones:");
                    int rep2 = scanner.nextInt();
                    Clase9_5 serie2 = new Clase9_5(rep2);
                    serie2.mostrarSeriePosNeg();
                    break;
                case 3: System.out.println("Introduzca el numero de repeticiones:");
                    int rep3 = scanner.nextInt();
                    Clase9_5 serie3 = new Clase9_5(rep3);
                    serie3.mostrarSerieFibonacci();
                    break;
                case 4: break;
                default: System.out.println("La opcion introducida no es valida");
            }
        }while (opcionMenu!=4);
       
    }
    
}
