package boletin9_2;

public class Clase9_2 {
    
    public void sumMultNum(){
        int num=11;
        int sum = 0;
        double mult = 1;
        
        while (num>10 && num<90){
            sum=sum+num;
            mult= mult*num;
            num++;
        }
        System.out.println("La suma de los numeros comprendidos entre 10 y 90 es: "+sum);
        System.out.println("La multiplicacion de los numeros comprendidos entre 10 y 90 es: "+mult);
    } 
}
