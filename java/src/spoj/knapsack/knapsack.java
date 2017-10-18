import java.util.Scanner;

class Main {
    static int [] arr;
    static int [] vals;
    static long[][] memo = new long[2000][2000];
    static int n;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        n = sc.nextInt();

        arr = new int[n];
        vals = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
            vals[i] = sc.nextInt();
        }

        long max = findMax(c, 0);
        System.out.println(max);
    }

    static long findMax(int c, int i) {
        long r;
        if(i == n ) return 0;
        if(c == 0) return 0;

        if(memo[i][c] != 0) {
            return memo[i][c];
        }

        if(arr[i] <= c)
            r = Math.max(
                    vals[i] + findMax(c - arr[i], i+1),
                    findMax(c, i+1)
            );
        else
            r = findMax(c, i + 1);
        memo[i][c] = r;
        return r;
    }
}
