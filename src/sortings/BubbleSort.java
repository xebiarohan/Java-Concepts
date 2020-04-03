package sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {34,1,45,19,6,83};

        for(int i=0;i<array.length-1;i++) {
            for(int j=i+1;j<array.length;j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
