package JavaAssignments.arrayLab;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int row = 0; row<arr.length; row++){
            for(int column = 0; column<arr[row].length; column++){
                arr[row][column] = s.nextInt();
            }
        }
        for(int row = 0; row<arr.length; row++){
            for(int column = 0; column<arr[row].length; column++){
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }

    }
}
