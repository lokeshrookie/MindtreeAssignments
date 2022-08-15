import java.util.Arrays;
import java.util.*;
public class Main implements Cloneable {
    public static void main(String[] args) {
//        String[] input = {"all", "the", "best"};
        String input = "all the best";
//        int[] arr = {5, 8, 15, 9, 1, 4};
//        int target = 1;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(binarySearch(arr, target));
        String[] words = input.split(" ");
        String reversestr = "";

        for(int i = words.length-1; i >= 0; i--){
            if(i == words.length-1){
                reversestr = reversestr + words[i];
            }else{
                reversestr = reversestr + " " + words[i];
            }
        }
        System.out.println(reversestr);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target < mid){
                end = mid-1;
            }
            else if( target  > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
