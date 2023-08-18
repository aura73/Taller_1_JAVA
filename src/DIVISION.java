import java.util.Scanner;

public class DIVISION {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //agregamos el scaner
        Scanner SC = new Scanner(System.in);
        //solicitamos las variables
        System.out.print("Ingrese el dividendo: ");
        int dvd = SC.nextInt();
        System.out.print("Ingrese el divisor: ");
        int dv = SC.nextInt();
        //operamos
        double rst = (double) dvd / dv;
        //calculamos el modulo y mostramos
        if (dvd % dv == 0) {
            System.out.println("La división es exacta.");
        } else {
            System.out.println("La división no es exacta.");
        }
    }
}