import java.util.Scanner;

public class Main {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("_______________________________________________");
            System.out.println("|    Calculadora de operaciones matematicas   |");
            System.out.println("| 1.- Suma de dos numeros                     |");
            System.out.println("| 2.- Raiz cuadrada de un numero              |");
            System.out.println("| 3.- Seno, coseno y tangente de un numero    |");
            System.out.println("| 4.- Salir                                   |");
            System.out.println("-----------------------------------------------");
            System.out.print(">> Ingrese una opcion: ");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    Suma suma1 =new Suma();
                    System.out.print("Ingrese el primer numero: ");
                    suma1.setNumero1(entrada.nextDouble());
                    System.out.print("Ingrese el segundo numero: ");
                    suma1.setNumero2(entrada.nextDouble());
                    suma1.imprimirSuma();
                    break;
                case 2:
                    Raiz raiz1 = new Raiz();
                    System.out.print("Ingrese un numero: ");
                    raiz1.setNumero(entrada.nextDouble());
                    raiz1.imprimirRaiz();
                    break;
                case 3:
                    Sen_cos_tan valores1=new Sen_cos_tan();
                    System.out.print("Ingrese un numero: ");
                    valores1.setNumero(entrada.nextDouble());
                    valores1.imprimirTrigonometria();
                    break;
                case 4:
                    break;
                default:
                    System.out.println(">> ¡Error! ingrese una opcion valida.");
            }
        } while (opcion!=4);
        System.out.println("Saliendo del programa . . .");
        System.out.print(">> FIN DEL PROGRAMA <<");
    }
}