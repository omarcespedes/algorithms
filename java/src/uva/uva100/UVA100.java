import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            long max;
            if(from < to) {
                max = computeMax(from, to);
            } else {
                max = computeMax(to, from);
            }
            System.out.println(from + " " + to + " " + max);
        }
    }

    static long computeMax(long start, long end) {
        long max = 0;
        for(long i = start ; i <= end; i++) {
            long val = doCycle(i);
            if(val > max) {
                max = val;
            }
        }
        return max;
    }

    static long doCycle(long n) {
        long count = 1;
        while(n != 1) {
            count++;
            if(n % 2 == 0) {
                n = n >> 1;
            } else {
                n = (n * 3) + 1;
            }
        }
        return count;
    }
}
