package dsaAssignments.LinearSearch;

public class Four {
    public static void main(String[] args) {
        String[] arr = {"Pepsi", "Coca-cola", "Limka", "Fanta", "Sprite"};
        String target = "Slice";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(target)){
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
