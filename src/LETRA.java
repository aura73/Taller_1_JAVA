import java.util.Scanner;

public class LETRA {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        System.out.print("Ingrese un simbolo: ");
        char simbolo = SC.next().charAt(0);

        int ascii = (int)simbolo;

        if (Character.isLetter(simbolo)) {
            System.out.println("Es una letra.");
            if (Character.isUpperCase(simbolo)) {
                System.out.println("Es mayúscula.");
            } else {
                System.out.println("Es minúscula.");
            }
        } else if (Character.isDigit(simbolo)) {
            System.out.println("Es un número.");
        } else {
            System.out.println("No es ni una letra ni un número.");
        }

    }
}

