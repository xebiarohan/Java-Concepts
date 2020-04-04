package sortings;

import java.util.Arrays;

public class QuickSort {
    int[] array = {34,1,45,19,6,83};
    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        sort.quickSort();
    }

    public void quickSort() {
        recSort(0,array.length-1);
        Arrays.stream(array).forEach(System.out::println);
    }

    public  void recSort(int left,int right) {
        if(right-left <=0) {
            return;
        } else {
            int pivot = array[right];
            int index = partition(left, right, pivot);
            recSort(left,index-1);
            recSort(index+1,right);
        }
    }

    public int partition(int left,int right, int pivot) {
        int leftPtr = left-1;
        int rightPtr = right;
        while (true) {
            while (array[++left] < array[pivot]) {
                ;
            }  while (array[--right] > array[pivot] && right >0) {
                ;
            }
            if(right-left <=0) {
                break;
            } else {
                swap(leftPtr,rightPtr);
            }
        }
        swap(leftPtr,right);
        return leftPtr;
    }


    public void swap(int right, int left) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
