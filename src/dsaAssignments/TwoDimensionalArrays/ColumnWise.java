package dsaAssignments.TwoDimensionalArrays;

public class ColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{1,4,6,8}, {2,3,6,7}, {7,8,5,1}};
        printColumnwise(arr);

    }
    static void printColumnwise(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;
        for(int i = 0; i<columns; i++){
            for(int j = 0; j<rows; j++){
                System.out.print(arr[j][i] + " ");
            }
        }
    }
}
