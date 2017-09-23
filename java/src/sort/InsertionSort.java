package sort;

public class InsertionSort {

    public int[] sort(int[] array) {
        int i;
        for( int j = 1 ; j < array.length; j++) {
            int key = array[j];
            i = j - 1;
            while( i > -1 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i+1] = key;
        }
        return array;
    }

    public int[] sortDecreasing(int[] array) {
        int i;
        for( int j = 1 ; j < array.length; j++) {
            int key = array[j];
            i = j - 1;
            while(i > -1 && array[i] < key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }


        return array;
    }
}
