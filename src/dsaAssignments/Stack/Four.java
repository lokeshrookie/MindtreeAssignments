package dsaAssignments.Stack;

import java.util.Stack;
public class Four {
    public static void main(String[] args) {
        int[] a = {1,9,3,5,4,6,3,8};
        Stack<Integer> stack = new Stack<>();
        for(int i: a){
            stack.push(i);
        }
        System.out.println(lessThanMiddle(stack));
    }
    static Stack<Integer> lessThanMiddle(Stack<Integer> stack){
        int mid = (stack.size())/2;
        Stack<Integer> temp = new Stack<>();
        int position = stack.size()-1;
        while(position > mid){
            stack.pop();
            position--;
        }
        int midElement = stack.peek();
        while(position >= 0){
            int element = stack.pop();
            if(element <  midElement){
                temp.push(element);
            }
            position--;
        }
//        System.out.println(" MId : " + midElement);
        return temp;
    }
}
