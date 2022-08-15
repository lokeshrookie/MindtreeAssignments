package dsaAssignments.LinearSearch;

// search sprite
public class Three {
    public static void main(String[] args) {
        String[] arr = {"Pepsi", "Coca-cola", "Limka", "Fanta", "Sprite"};
        String target = "Sprite";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(target)){
                System.out.println("Found at index: " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
