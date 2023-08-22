import java.util.Scanner;
class triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dame la longitud del primer lao: ");
        double lao1 = input.nextDouble();

        System.out.println("Dame la longitud del segundo lao: ");
        double lao2 = input.nextDouble();

        System.out.println("Dame la longitud del tercer lao: ");
        double lao3 = input.nextDouble();

        String resultado = tipoDeTriangulo(lao1, lao2, lao3);
        System.out.println(resultado);

        input.close();
    }

    public static String tipoDeTriangulo(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Eso no e' un triángulo válido, mi hermano.";
        } else if (a == b && b == c) {
            return "E' un triángulo equilátero, ¡qué bueno!";
        } else if (a == b || a == c || b == c) {
            return "E' un triángulo isósceles, bastante bien.";
        } else {
            return "E' un triángulo escaleno, bien variado.";
        }
    }
}
