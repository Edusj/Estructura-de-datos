public class Palindrome {
    public static boolean esPalindromo (String cadena, int inicio, int fin){
        if (inicio >= fin) {
            return true;
        }
        if (cadena.charAt(inicio) != cadena.charAt(fin)) {
            return false;
        }
        return esPalindromo(cadena, inicio + 1, fin - 1);
    }