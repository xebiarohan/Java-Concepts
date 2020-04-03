package sortings;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {34, 1, 45, 19, 6, 83};

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int value = array[i];
            while (j >=0 && array[j] > value) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = value;

        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
