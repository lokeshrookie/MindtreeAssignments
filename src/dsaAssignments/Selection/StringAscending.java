package dsaAssignments.Selection;

import java.util.Arrays;
public class StringAscending {
    public static void main(String[] args) {
        String[] arr = {"Pepsi", "Coca-Cola", "Limka", "Fanta", "Sprite"};
        System.out.println(Arrays.toString(arr));
        ascending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ascending(String[] a){
        int first = 0;
        for(int i = 0;  i<a.length; i++){
            int last = a.length-i-1;
            int maxIndex = findMax(a, first, last);
            swap(a, maxIndex, last);
        }
    }
    static int findMax(String[] arr, int first, int last){
        int max = first;
        for(int i = first;  i<=last; i++){
            if(arr[i].charAt(0) > arr[max].charAt(0)){
                max = i;
            }
        }
        return max;
    }
    static void swap(String[] arr,  int first , int second){
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
