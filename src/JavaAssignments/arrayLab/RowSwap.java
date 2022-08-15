package JavaAssignments.arrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class RowSwap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int row = 0; row<arr.length; row++){
            for(int column = 0; column<arr[row].length; column++){
                arr[row][column] = s.nextInt();
            }
        }
        System.out.println("Before: ");
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
        swapRow(arr, 0, arr.length-1);
        System.out.println("After: ");
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }

    static void swapRow(int[][] arr, int first , int second ){
        int[] temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
