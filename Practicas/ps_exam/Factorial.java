import java.util.Scanner;

public class Factorial {
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
        public static String operacionFactorial(int n) {
            if (n < 0) return "No definida";
            if (n == 0 || n == 1) return n + "! = 1";
            StringBuilder sb = new StringBuilder();
            sb.append(n).append("! = ");
            for (int i = n; i > 1; i--) {
                sb.append(i).append(" x ");
            }
            sb.append("1");
            return sb.toString();
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese un número para calcular su factorial (o -1 para salir): ");
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            if (numero < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else {
                String operacion = operacionFactorial(numero);
                long resultado = factorial(numero);
                System.out.println(operacion + " = " + resultado);
            }
        }
        scanner.close();
    }
}