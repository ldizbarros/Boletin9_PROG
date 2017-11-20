package boletin9_1;

import java.util.Scanner;

public class Clase9_1 {
    
    public void contNumeros(){
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        int pos = 0, neg=0, ceros= 0;
        
        while(cont<10){
            System.out.println("Introduzca un numero:");
            int num = sc.nextInt();
            
            if (num == 0){
                ceros+=1;
            }else if (num>0){
                pos+=1;
            }else{
                neg+=1;
            }
            cont++;
        }
        System.out.println("Hay "+pos+" numeros positivos, "+neg+" numeros"
                + " negativos y "+ceros+" ceros");
    }
    
}
