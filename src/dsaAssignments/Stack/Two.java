package dsaAssignments.Stack;

import java.util.Stack;

public class Two {
    public static void main(String[] args) {
        int[] a = {1,9,3,5,4,6,3,8};
        Stack<Integer> stack = new Stack<>();
        for(int i: a){
            stack.push(i);
        }
        int target = 5;
        System.out.println(stack);
        System.out.println(findPosition(stack, target));
    }
    static int findPosition(Stack<Integer> stack, int target){
        int top = stack.size();
        int position = 0;
        for(int i : stack){
            if(i == target){
                position = stack.size()-top;
            }
            top--;
        }
        return position;
    }
}
