package sortings;

import java.util.Arrays;

public class MergeSort {
    int[] array = {34,1,45,19,6,83};

    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        sort.mergeSort();
    }

    public  void mergeSort() {
        int[] copyArray = new int[array.length];
        recMerge(copyArray,0,array.length-1);
        Arrays.stream(array).forEach(System.out::println);
    }

    public void recMerge(int[] copyArray, int leftIndex,int rightIndex) {
        if(rightIndex == leftIndex) {
            return;
        } else {
            int mid = (rightIndex+leftIndex)/2;
            recMerge(copyArray,leftIndex,mid);
            recMerge(copyArray,mid+1,rightIndex);
            merge(copyArray,leftIndex,rightIndex,mid+1);
        }
    }

    public void merge(int[] copyArray,int lowerPtr,int upperbound, int highPtr) {
        int j=0;
        int midValue = highPtr-1;
        int lowerIndex = lowerPtr;
        int n = upperbound -lowerIndex+1;

        while(lowerPtr <= midValue && highPtr <= upperbound) {
            if(array[lowerPtr] > array[highPtr]) {
                copyArray[j++] = array[highPtr++];
            } else {
                copyArray[j++] = array[lowerPtr++];
            }
        }

        while (lowerPtr <= midValue) {
            copyArray[j++] = array[lowerPtr++];
        }

        while (highPtr <= upperbound) {
            copyArray[j++] = array[highPtr++];
        }

        for(int i=0 ;i<n;i++) {
            array[lowerIndex +i] = copyArray[i];
        }
    }
}
