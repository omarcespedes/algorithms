import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main44 {
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
//
//        Integer[] l1test = new Integer[]{-1,2,5,11};
//        Integer[] l2test = new Integer[]{-1,2,5,11,13};
//
//        System.out.println(compareLists(Arrays.asList(l1test), Arrays.asList(l2test)));
        //TODO use next int instead of next line
            while(true) {
                String l1 = sc.nextLine();
                if(l1.equals("0")) break;
                String l2 = sc.nextLine();

                List<Integer> list1 = new ArrayList<>();
                List<Integer> list2 = new ArrayList<>();

                String[] s = l1.split(" ");
                int length = Integer.parseInt(s[0]);
                for(int i = 1 ; i <= length ; i++ ) {
                    list1.add(Integer.parseInt(s[i]));
                }

                s = l2.split(" ");
                length = Integer.parseInt(s[0]);
                for(int i = 1 ; i <= length ; i++ ) {
                    list2.add(Integer.parseInt(s[i]));
                }

                System.out.println(compareLists(list1, list2));
            }
        } catch (Exception e) {
            return;
        }
    }

    static long compareLists(List<Integer> l1, List<Integer> l2) {
        long total = 0;
        long total1 = 0;
        long total2 = 0;
        int initialIndex = 0;
        int bridgeIndex;
        for(int i : l1) {
            total1 += i;
            bridgeIndex = l2.indexOf(i);
            if(bridgeIndex > -1) { //found
                for(int x = initialIndex ; x <= bridgeIndex ; x++) {
                    total2 += l2.get(x);
                }
                total += total1 > total2? total1: total2;
                initialIndex = bridgeIndex + 1;
                total1 = 0;
                total2 = 0;
            }
        }

        if(initialIndex <= l2.size()) {
            for(int x = initialIndex ; x <= l2.size() - 1 ; x++) {
                total2 += l2.get(x);
            }
        }

        if(total1 > 0) {
            if(total2 > 0) {
                return total + (total1 > total2? total1 : total2);
            } else {
                return total + total1;
            }
        }

        if(total2 > 0) {
            return total + total2;
        }

        return total;
    }
}