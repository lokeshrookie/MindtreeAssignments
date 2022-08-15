package JavaAssignments.arrayLab.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int[] rev = new int[12];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length -1 - i];
        }
        System.out.println(Arrays.toString(rev));
    }
}
