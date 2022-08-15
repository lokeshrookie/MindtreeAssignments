package JavaAssignments.arrayLab.chapter2;

import java.util.Scanner;

class Twelve {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[12];
        System.out.println("Enter 12 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        // count positive, even , odd numbers;
        int positive = 0, even = 0, odd = 0;
        for (int i : arr) {
            if (i > 0) {
                positive++;
            }
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Positive: " + positive + "\nEven: " + even + "\nOdd : " + odd);
    }

}
