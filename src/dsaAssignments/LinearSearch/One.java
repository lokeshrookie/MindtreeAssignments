package dsaAssignments.LinearSearch;

public class One {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        // search 5
        int target = 5;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not Found");

    }
}
