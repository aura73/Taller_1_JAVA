import java.util.Scanner;

class AÑO_BISIESTO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ingrese el año
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        // Verificar si el año es bisiesto según las reglas dadas
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es bisiesto");
        } else {
            System.out.println(año + " no es bisiesto");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
