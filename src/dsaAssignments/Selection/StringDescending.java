package dsaAssignments.Selection;

import java.util.Arrays;
public class StringDescending {
    public static void main(String[] args) {
        String[] arr = {"Pepsi", "Coca-Cola", "Limka", "Fanta", "Sprite"};
        System.out.println(Arrays.toString(arr));
        descending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void descending(String[] a){
        int first = 0;
        // select max at put it in the last
        for(int i = 0;  i<a.length; i++){
            int last = a.length-i-1;
            int minIndex = findMax(a, first, last);
            swap(a, minIndex, last);
        }
    }
    static int findMax(String[] arr, int first, int last){
        int min = first;
        for(int i = first;  i<=last; i++){
            if(arr[i].charAt(0) < arr[min].charAt(0)){
                min = i;
            }
        }
        return min;
    }
    static void swap(String[] arr,  int first , int second){
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
