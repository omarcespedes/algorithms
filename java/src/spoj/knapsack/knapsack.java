import java.util.Scanner;

class Main88 {
    static int [] arr  = new int[]{3,2,1,2,2};
    static int [] vals = new int[]{0,4,8,5,3};
    static int n;
    public static void main(String[] args) {
        n = 5;
        findMax(4, 0);

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

    static long findMax(int capacity, int i) {
        if(i >= n - 1) {
            return 0;
        }
        int val = vals[i];
        if(arr[i] > capacity){
            if(capacity > 0){
                return findMax(capacity, i + 1);
            } else {
                return 0;
            }
        }

        if(capacity - arr[i] == 0) {
            return val;
        }

        return Math.max(
            val + findMax(capacity - arr[i], i+1),
            findMax(capacity, i+1)
        );
    }
}
