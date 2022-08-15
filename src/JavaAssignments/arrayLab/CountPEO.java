package JavaAssignments.arrayLab;

import java.util.Scanner;

public class CountPEO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[12];
        int positive = 0, even = 0, odd = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = s.nextInt();
            if(arr[i] > 0){
                positive++;
            }
            if (arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Positive: " +  positive +
                "\n Even: " + even + "\n Odd: " + odd);
    }
}
