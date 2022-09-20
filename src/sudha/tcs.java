package sudha;

import java.util.Scanner;

public class tcs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns  = s.nextInt();
        int[][] arr = new int[rows][columns];
        String input = s.next();
        Position car = new Position(rows, columns);
        while(!input.equals("")){
            char  d = input.charAt(0);
            if( d == 'L'){
                car.y = car.y-1;
            }
            else if(d == 'R'){
                car.y  = car.y+1;
            }
            else if(d == 'F'){
                car.x = car.x-1;
            }
            else if(d == 'B'){
                car.x = car.x+1;
            }
            if(car.x > rows || car.x <1 || car.y > columns  || car.y <1){
                System.out.println("unsafe");
                return;
            }

            input = input.substring(1);
        }
        System.out.println("safe");

    }
    static class Position {
        int x;
        int y;
        Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
