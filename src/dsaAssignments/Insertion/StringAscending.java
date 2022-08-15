package dsaAssignments.Insertion;

import java.util.Arrays;
public class StringAscending {
    public static void main(String[] args) {
        String[] arr = {"Pepsi", "Coca-cola", "Limka", "Fanta", "Sprite"};
        System.out.println(Arrays.toString(arr));
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(String[] arr){
        for (int i = 0; i <arr.length-1; i++) { // i runs till n-1 . if i = 2, j runs 3 times, j=(3,2,1) // if i = 3, j = (4,3,2,1).
            for (int j = i+1 ; j > 0 ; j--) {
                if(arr[j].compareTo(arr[j-1]) < 0){
                    swap(arr, j, j-1);
                }
                else
                {
                    break; // because left hand side elements are sorted.
                }
            }
        }
    }
    static void swap(String [] arr, int first, int second){
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
