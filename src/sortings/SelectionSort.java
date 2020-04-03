package sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {34,1,45,19,6,83};


        for(int i=0;i<array.length-1;i++) {
            int minValue = array[i];
            int index = i;
            for(int j = i+1;j<array.length;j++) {
                if(minValue > array[j]) {
                    minValue = array[j];
                    index = j;
                }

            }
            int temp = array[i];
            array[i] = minValue;
            array[index] = temp;
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
