package dsaAssignments.Stack;

import java.util.Stack;
public class Three {
    public static void main(String[] args) {
        int[] a = {1,9,3,5,4,6,3,8};
        Stack<Integer> stack = new Stack<>();
        for(int i: a){
            stack.push(i);
        }
        System.out.println(findMiddle(stack));
    }
    static int findMiddle(Stack<Integer> stack){
        int mid = stack.size()/2;
        int position = 0;
        while(position < mid){
            stack.pop();
            position++;
        }
        return stack.pop();
    }
}
