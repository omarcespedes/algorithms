package dinamyc_programming.dp_fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }
    static int[] memo = new int[20000];
    static int fibonacci(int n) {
        int r;
        if(n == 1 || n == 2){
            return 1;
        }
        if(memo[n] != 0) {
            return memo[n];
        }
        r = fibonacci(n - 1) + fibonacci(n - 2);
        memo[n] = r;
        return r;
    }
}
