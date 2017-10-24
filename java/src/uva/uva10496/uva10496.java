import java.util.Scanner;

class Main10496 {
    static int xDots[];
    static int yDots[];
    static int nC;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int initX = sc.nextInt();
            int initY = sc.nextInt();
            nC = sc.nextInt() + 1;

            xDots = new int[nC + 1];
            yDots = new int[nC + 1];

            xDots[0] = initX;
            yDots[0] = initY;

            for(int j = 1 ; j < nC; j++) {
                xDots[j] = sc.nextInt();
                yDots[j] = sc.nextInt();
            }

            minDistance(0);
        }

    }

    static int minDistance(int index) {
        int min = Integer.MAX_VALUE;
        int x1 = xDots[index];
        int y1 = yDots[index];

        for(int i = index + 1 ; i < nC ; i++ ) {
            int d = pointDistance(x1, xDots[i], y1, yDots[1]);
            if(d < min) {
                min = d;
            } else if(d == min) {

            }

        }

        return min;
    }

    static int pointDistance(int x1, int x2, int y1, int y2){
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
