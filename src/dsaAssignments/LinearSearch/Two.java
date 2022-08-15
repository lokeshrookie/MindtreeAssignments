package dsaAssignments.LinearSearch;

public class Two {
    //search 8
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        int target = 8;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found at index: " + i  );
                return;
            }
        }
        System.out.println("Not Found");
    }
}
