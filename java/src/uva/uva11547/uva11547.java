import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) {
            int x = sc.nextInt();
            long res = 315*x + 36962;
            String resX = "" + res;
            System.out.println(resX.charAt(resX.length()-2));
        }
    }
}