package JavaAssignments.arrayLab.chapter1;

import java.util.Arrays;

public class Evenirst {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,11,10};
        System.out.println(Arrays.toString(reconstruct(arr)));
    }
    static int[] reconstruct(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            while(arr[start]%2 == 0){
                start++;
            }
            while(arr[end] %2 != 0 ){
                end--;
            }
            if(arr[start]%2 != 0){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return arr;
    }

    static  void swap(int[] arr, int f , int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
