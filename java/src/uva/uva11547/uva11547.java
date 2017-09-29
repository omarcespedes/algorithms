import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            long res = 315*n + 36962;
            //System.out.println(res);
            System.out.println((res/10)%10);
        }
    }
}