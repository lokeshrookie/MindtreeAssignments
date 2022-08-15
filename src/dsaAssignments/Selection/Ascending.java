package dsaAssignments.Selection;

import java.util.Arrays;
public class Ascending {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        System.out.println(Arrays.toString(a));
        ascending(a);
        System.out.println(Arrays.toString(a));
    }
    static void ascending(int[] a){
        int first = 0;
        // select max at put it in the last
        for(int i = 0;  i<a.length; i++){
            int last = a.length-i-1;
            int maxIndex = findMax(a, first, last);
            swap(a, maxIndex, last);
        }
    }
    static int findMax(int[] arr, int first, int last){
        int max = first;
        for(int i = first;  i<=last; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
