import static java.lang.Math.sqrt;
public class Sen_cos_tan {
    private double numero;
    //constructor
    public Sen_cos_tan() {
    }
    public Sen_cos_tan(double numero) {
        this.numero = numero;
    }
    //getters
    public double getNumero() {
        return numero;
    }
    //setters
    public void setNumero(double numero) {
        this.numero = numero;
    }
    //metodo imprimir
    public void imprimirTrigonometria(){
        double resultado1 = Math.sin(numero);
        double resultado2 = Math.cos(numero);
        double resultado3 = Math.tan(numero);
        System.out.println("El seno del numero es: "+ resultado1);
        System.out.println("El coseno del numero es: "+ resultado2);
        System.out.println("El tangente del numero es: "+ resultado3);
    }
}
