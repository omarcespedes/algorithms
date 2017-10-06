import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            } else {
                long val = countWays(s);
                System.out.println(val);
            }
        }
    }

    static long countWays(String word) {
        long[] calcs = new long[word.length() + 1];
        calcs[0] = 1;
        for(int i = 0 ; i < word.length(); i++) {
            int digit = word.charAt(i) - '0';
            int nextDigit = i + 1 <= word.length() - 1? word.charAt(i+1) - '0': -1;
            if(nextDigit != -1 && ((digit == 2 && nextDigit < 7) || digit == 1)) {
                calcs[i + 2] = calcs[i] + calcs[i + 2];
                if(nextDigit == 0) {
                    i++;
                    continue;
                }
            }
            calcs[i + 1] = calcs[i] + calcs[i + 1];
        }
        return calcs[calcs.length - 1];
    }
}
