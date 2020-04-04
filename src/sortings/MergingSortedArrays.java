package sortings;

import java.util.Arrays;

public class MergingSortedArrays {
    static int[] array1 = {1, 10, 20, 25};
    static int[] array2 = {5, 12, 24, 43, 56, 74};

    public static void main(String[] args) {
        int minLength = array1.length > array2.length ? array2.length : array1.length;
        int[] sortedArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < minLength && j < minLength) {
            if (array1[i] > array2[j]) {
                sortedArray[k++] = array2[j++];
            } else {
                sortedArray[k++] = array1[i++];
            }
        }
        while (j < array2.length) {
            sortedArray[k++] = array2[j++];
        }
        while (i < array1.length) {
            sortedArray[k++] = array1[i++];
        }

        Arrays.stream(sortedArray).forEach(System.out::println);
    }

}