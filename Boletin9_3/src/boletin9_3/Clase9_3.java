package boletin9_3;

public class Clase9_3 {
    private double base,altura;
    
    public Clase9_3(double base,double altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void calcularArea(){
        if (base>0 && altura>0){
            System.out.println("A area do triangulo e "+base*altura);
        }
        else{
            System.out.println("Los datos intoducidos no son validos");
        }
    }
}
