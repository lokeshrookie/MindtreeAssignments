package dsaAssignments.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class LessThanMiddle {
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
        System.out.println(lessThanMiddle(queue));
    }
    static Queue<Integer> lessThanMiddle(Queue<Integer> queue){
        Queue<Integer> ans = new ArrayDeque<>();
        int middle = queue.size()/2;
        int position = 0;
        while(position < middle){
            ans.add(queue.remove());
            position++;
        }
        int middleElement = queue.remove();
        while(!queue.isEmpty()){
            queue.remove();
            position++;
        }
        while (!ans.isEmpty()){
            int element = ans.remove();
            if(element < middleElement){
                queue.add(element);
            }
        }
        return queue;
    }
}
