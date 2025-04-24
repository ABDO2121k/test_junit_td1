package kouahai.test.td1;

public class Calculatrice {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int soustraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro");
            throw new ArithmeticException("Division par zéro");
        }
        return (double) a / b;
    }
}