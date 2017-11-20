package boletin9_6;

import java.util.Scanner;

public class Clase9_6 {
    
    public void contarSoldo(){
        Scanner sc = new Scanner(System.in);
        
        double soldo;
        int numtotal=0;
        int traball1=0;
        int traball2=0;
        
        do{
            System.out.println("Introduzca o soldo:");
            soldo = sc.nextDouble();
            if (!(soldo<=0)){
                numtotal ++;
                if (soldo<1000){
                    traball1 ++;   //traballadores que gañan menos de 1000
                }else if(soldo>=1000 && soldo<=1750){
                    traball2 ++;   //traballadores que gañan entre 1000 e 1750
                }
            }
        }while(soldo!=0);
        
        System.out.println("Numero de traballadore que gaña entre 1000 e"
                + "1750: "+traball2);
        System.out.println("Porcentaxe de traballadore que gaña menos de 1000 "
                + "euros: "+(traball1*100)/numtotal+"%");
        
    }
    
}
