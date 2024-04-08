import java.util.Scanner;

public class ConversorSistemasNumericos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el sistema numérico de entrada:");
        System.out.println("1. Decimal");
        System.out.println("2. Hexadecimal");
        System.out.println("3. Binario");
        System.out.println("4. Octal");

        System.out.print("Seleccione una opción (1/2/3/4): ");
        int entrada = scanner.nextInt();

        System.out.print("Ingrese un número de entrada en su correspondiente sistema: ");
        String numeroEntrada = scanner.next();

        int numeroDecimal;

        switch (entrada) {

            case 1:
                numeroDecimal = Integer.parseInt(numeroEntrada);
                break;

            case 2:                                 // (cadena, base)
                numeroDecimal = Integer.parseInt(numeroEntrada, 16);
                break;

            case 3:
                numeroDecimal = Integer.parseInt(numeroEntrada, 2);
                break;

            case 4:
                numeroDecimal = Integer.parseInt(numeroEntrada, 8);
                break;

            default:
                System.out.println("Opción no válida. Intente nuevamente.");
                scanner.close();
                return;
        }

        System.out.println("Elija el sistema numérico de salida:");
        System.out.println("1. Decimal");
        System.out.println("2. Hexadecimal");
        System.out.println("3. Binario");
        System.out.println("4. Octal");

        System.out.print("Seleccione una opción (1/2/3/4): ");
        int salida = scanner.nextInt();

        switch (salida) {

            case 1:
                System.out.println("Decimal: " + numeroDecimal);
                break;

            case 2:
                System.out.println("Hexadecimal: " + Integer.toHexString(numeroDecimal).toUpperCase());
                break;

            case 3:
                System.out.println("Binario: " + Integer.toBinaryString(numeroDecimal));
                break;

            case 4:
                System.out.println("Octal: " + Integer.toOctalString(numeroDecimal));
                break;

            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }

        scanner.close();
    }
}