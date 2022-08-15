package dsaAssignments.BinarySearch;

import java.util.Arrays;
public class Two {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        int target = 8;
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
