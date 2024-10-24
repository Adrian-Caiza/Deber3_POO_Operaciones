import static java.lang.Math.sqrt;
public class Raiz {
    private double numero;
    //constructor
    public Raiz() {
    }
    public Raiz(double numero) {
        this.numero = numero;
    }
    //getters
    private double getNumero() {
        return numero;
    }
    //setters
    public void setNumero(double numero) {
        this.numero = numero;
    }
    //metodo imprimir
    public void imprimirRaiz(){
        double resultado=Math.sqrt(numero);
        System.out.println("La raiz cuadrada del numero es: "+ resultado);
    }
}
