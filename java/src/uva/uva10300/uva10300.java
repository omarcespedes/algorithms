import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcNumber = sc.nextInt();
        for(int i = 0 ; i < tcNumber ; i++) {
            long sum = 0;
            int farmers = sc.nextInt();
            for (int j = 0 ; j < farmers ; j++) {
                String line = sc.nextLine();
                String[] vals= line.split("\\s");
                sum += (Integer.parseInt(vals[0]) * Integer.parseInt(vals[1]));
            }
            System.out.println(sum);
        }
    }
}