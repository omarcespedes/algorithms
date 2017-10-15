import java.util.Scanner;

class Main {
    static int [] arr;
    static int [] vals;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        n = sc.nextInt();

        arr = new int[n];
        vals = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
            vals[i] = sc.nextInt();
        }

        long max = findMax(c, 0, 0);
        System.out.println(max);
    }

    static long findMax(int capacity, int i, long max) {
        if(i >= n - 1) {
            return max;
        }
        if(arr[i] > capacity){
            if(capacity > 0){
                return Math.max(
                        max,
                        findMax(capacity, i + 1, max)
                );
            } else {
                return max;
            }
        }

        return Math.max(
            findMax(capacity - arr[i], i+1, max + vals[i]),
            findMax(capacity, i+1, max)
        );
    }

    static void printArray(int [] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
