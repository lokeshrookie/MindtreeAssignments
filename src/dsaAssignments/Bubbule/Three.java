package dsaAssignments.Bubbule;

import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        String[] arr = {"Pepsi", "Coca-cola", "Limka", "Fanta", "Sprite"};
        ascending(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ascending(String[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i].charAt(0) > arr[j].charAt(0)){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
