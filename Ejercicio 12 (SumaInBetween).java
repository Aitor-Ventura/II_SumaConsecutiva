import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {

    public static void main(String[] args) {
        suma();
    }
    
    /**
    * Método principal a modificar. Debe incluir las instrucciones 
    * necesarias para mostrar por pantalla la suma de todos los números
    * comprendidos entre 1 y num, ambos incluidos
    */
    public static void suma() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}