public class Suma {
    private double numero1;
    private double numero2;
    //constructor
    public Suma() {
    }
    public Suma(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //getters
    private double getNumero1() {
        return numero1;
    }
    private double getNumero2() {
        return numero2;
    }
    //setters
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    //metodo imprimir
    public void imprimirSuma(){
        double resultado = numero1 + numero2;
        System.out.println("El resultado de la suma de los numeros es: "+ resultado);
    }
}
