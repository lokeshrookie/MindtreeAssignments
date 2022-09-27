import java.util.Scanner;

public class Hemanth {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rep = s.nextInt();
        for (int i = 0; i < rep; i++) {
            int  num = s.nextInt();
            method(num);
        }
    }
    static void method(int num){
        if(num >=0 && num<=40){
            System.out.println("U");
        }
        else if(num >=41 && num <= 50){
            System.out.println("D");
        }
        else if(num >=51 && num <= 60){
            System.out.println("C");
        }else if(num >=61 && num <= 70){
            System.out.println("B");
        }else if(num >=71 && num <= 80){
            System.out.println("B+");
        }else if(num >=81 && num <= 90){
            System.out.println("A");
        }else if(num >=91 && num <= 100){
            System.out.println("S");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
