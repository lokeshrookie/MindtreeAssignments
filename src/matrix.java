
import  java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> diagonal = new ArrayList<>();
        int size = s.nextInt();
        int[][] ar = new int[size][size];
        for (int i = 0; i <ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i <ar.length; i++) {
            int d = ar[i].length-(i+1);
            for (int j = 0; j < ar[i].length; j++) {

                if(j < d){
                    first.add(ar[i][j]);
                }
                else  if(j == d){
                        diagonal.add(ar[i][j]);
                }
                else{
                 second.add(ar[i][j]);
                }
            }
        }
        first.addAll(diagonal);
        first.addAll(second);
        System.out.println(first);
    }
}
