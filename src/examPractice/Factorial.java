package examPractice;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculateFactorial(n));
        System.out.println(calculateFactorialRecursively(n));
    }

    public static int calculateFactorial(int n) {
        int factoriel = 1;
        for (int i = 1; i <= n; i++) {
            factoriel *= i;
        }
        return factoriel;
    }

    public static int calculateFactorialRecursively(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorialRecursively(n - 1);
    }
}
