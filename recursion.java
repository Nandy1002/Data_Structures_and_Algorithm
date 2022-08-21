/* In recursive function we call a function while defining that function and it store its call memory in stack */
public class recursion {
    public static int factorial(int n) {
        // base condition
        if (n == 1 || n == 0) {
            return 1;
        } else {
            // recursion call
            return n * factorial(n - 1);
        }
    }

    public static int linearSum(int n) {
        // base condtion
        if (n == 0) {
            return 0;
        } else {
            // recursive call
            return n + linearSum(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            // base condition
            return n;
        } else {
            // recusion call
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // calling recersion function
        int fact = factorial(n);
        int sum = linearSum(n);
        int fibo = fibonacci(n);
        System.out.println(fact);
        System.out.println(sum);
        System.out.println(fibo);
    }
}
