public class RecursiveFibonacci {
    // Recursive method to get the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to print
        System.out.print("Fibonacci Series (Recursion): ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}