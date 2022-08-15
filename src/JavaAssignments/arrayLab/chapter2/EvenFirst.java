package JavaAssignments.arrayLab.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class EvenFirst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(reconstruct2(arr)));
    }

    static int[] reconstruct2(int[] arr){
        int[] ans = new int[arr.length];
        // fill even numbers in ans array first
        int i = 0;
        int index = 0;
        // i - index for ans. index is for arr.
        while(index < arr.length){
            if(arr[index]%2 == 0){
                ans[i] = arr[index];
                i++;
            }
            index++;
        }
        // now all the even elements were added.
        index = 0;
        // ans is semi filled. keep filling the ans with the help of i as index.
        while(index < arr.length){
            if(arr[index]%2 != 0){
                ans[i] = arr[index];
                i++;
            }
            index++;
        }
        return ans;
    }

}
