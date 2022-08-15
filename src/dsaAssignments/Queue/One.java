package dsaAssignments.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class One {
    public static void main(String[] args) {
        int[] arr = { 1,9,3,5,4,6,2,8};
        Queue<Integer> queue  = new ArrayDeque<>();
        for(int i: arr){
            queue.add(i);
        }
        System.out.println(queue);
    }
}
