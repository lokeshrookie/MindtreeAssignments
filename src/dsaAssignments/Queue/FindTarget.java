package dsaAssignments.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr = { 1,9,3,5,4,6,2,8};
        int target = 5;
        Queue<Integer> queue  = new ArrayDeque<>();
        for(int i: arr){
            queue.add(i);
        }
        for(int i:queue){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(findPosition(queue, target));
    }
    static int findPosition(Queue<Integer> queue, int target){
        int position = 0;
        for(int i : queue){
            if(i == target){
                return position;
            }
            position++;
        }
        return -1;
    }
}
