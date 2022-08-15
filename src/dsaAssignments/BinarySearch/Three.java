package dsaAssignments.BinarySearch;

public class Three {
    public static void main(String[] args) {
        String[] arr = {"Pepsi", "Coca-cola", "Limka", "Fanta", "Sprite"};
        String target = "Sprite";
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(String[] arr, String target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target.compareTo(arr[mid]) == 0){
                return mid;
            }
            else if(target.compareTo(arr[mid]) < 0){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
