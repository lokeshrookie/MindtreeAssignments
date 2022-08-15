package dsaAssignments.Selection;

import java.util.Arrays;
public class Descending {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        descending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void descending(int[] a){
        int first = 0;
        // select max at put it in the last
        for(int i = 0;  i<a.length; i++){
            int last = a.length-i-1;
            int minIndex = findMin(a, first, last);
            swap(a, minIndex, last);
        }
    }
    static int findMin(int[] arr, int first, int last){
        int min = first;
        for(int i = first;  i<=last; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
