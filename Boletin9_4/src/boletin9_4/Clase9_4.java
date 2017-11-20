package boletin9_4;

public class Clase9_4 {
    private int num;
    
    public  Clase9_4(int num){
        this.num=num;
    }
    
    public void tablaMultiplicar(){
        int cont;

        for(cont=1; cont<=10; cont++){
            System.out.println(num+" * "+cont+" = "+num*cont);
        }
    }
}
