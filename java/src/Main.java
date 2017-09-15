import sort.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        InsertionSort iSort = new InsertionSort();
        int[] array = {5,2,4,6,1};
        int[] sorted = iSort.sort(array);
        System.out.println(Arrays.toString(sorted));
    }
}
