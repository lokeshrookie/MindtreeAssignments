package JavaAssignments.arrayLab.operatorLab;

import java.util.Scanner;

public class SumOfThreeDigitNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        sum(number);
    }
    static void sum(int number){
        if(isThreeDigit(number)){
            int sum = 0;
            while(number>0){
                sum += number%10;
                number/=10;
            }
            System.out.println("Sum : " + sum );
        }
        else{
            System.out.println("Not a three digit number");
        }

    }
    static boolean isThreeDigit(int number){
        int count = 0;
        while(number>0){
            count++;
            number/=10;
        }
        return count==3;
    }
}
