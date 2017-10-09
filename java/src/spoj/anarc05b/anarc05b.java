import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while(true) {
            int length = sc.nextInt();
            if(length == 0) break;

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            for(int i = 0 ; i < length ; i++ ) {
                list1.add(sc.nextInt());
            }

            length = sc.nextInt();
            for(int i = 0 ; i < length ; i++ ) {
                list2.add(sc.nextInt());
            }

            System.out.println(compareLists(list1, list2));
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