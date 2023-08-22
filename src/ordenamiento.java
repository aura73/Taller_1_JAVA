
    import java.util.Scanner;

    public class ordenamiento {
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que ingrese cuatro números
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Ingrese el tercer número: ");
            int num3 = scanner.nextInt();

            System.out.print("Ingrese el cuarto número: ");
            int num4 = scanner.nextInt();

            // Ordenar los números de menor a mayor
            int temp;

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            if (num2 > num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }

            if (num3 > num4) {
                temp = num3;
                num3 = num4;
                num4 = temp;
            }

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            if (num2 > num3) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }

            if (num1 > num2) {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }

            // Mostrar los números ordenados
            System.out.println("Números ordenados de menor a mayor: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
        }
    }
