package dsaAssignments.TwoDimensionalArrays;

public class RowWise {
    public static void main(String[] args) {
        int[][] arr = {{1,4,6,8}, {2,3,6,7}, {7,8,5,1}};
        printRows(arr);
    }
    static void printRows(int[][] arr){
        int rows = arr.length;
        int columns = arr[0].length;
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
