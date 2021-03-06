package boletin9_5;

public class Clase9_5 {
    private int cont;
    
    public Clase9_5(int cont){
        this.cont=cont;
    }
    
    public void mostrarSeriePares(){
        int i;
        int num=0;
        
        for(i=0;i<cont;i++){
            num+=2;
            System.out.print(num+" + ");
        }
        System.out.print("\n");
    }
    
    public void mostrarSeriePosNeg(){
        int i;
        
        for(i=1;i<cont;i++){
            if (i%2 != 0){
                System.out.print(" - "+i);
            }
            else{
                System.out.print(" + "+i);
            }
        }
        System.out.print("\n");
    }
    
    public void mostrarSerieFibonacci(){
        int i;
        int sum=0;
        int num1=0;
        int num2=1;
        
        System.out.print(num1+", "+num2+", ");
        for(i=2;i<cont;i++){
            sum=num1+num2;
            System.out.print(sum+", ");
            num1=num2;
            num2=sum;
        }
        System.out.print("\n");
    }
}