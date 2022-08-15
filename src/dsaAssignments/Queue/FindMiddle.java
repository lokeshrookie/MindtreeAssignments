package dsaAssignments.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindMiddle {
    public static void main(String[] args) {
        int[] arr = { 1,9,3,5,4,6,2,8};
        Queue<Integer> queue  = new ArrayDeque<>();
        for(int i: arr){
            queue.add(i);
        }
        for(int i:queue){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(findMiddle(queue));
    }

    static int findMiddle(Queue<Integer> queue){
        Queue<Integer> temp =  new ArrayDeque<>();
        // work on temp queue to avoid changes in main queue
        int middle = queue.size()/2;
        int position = 0;
        while(position <  middle){
            queue.remove();
            position++;
        }
        return queue.element();
    }

}
