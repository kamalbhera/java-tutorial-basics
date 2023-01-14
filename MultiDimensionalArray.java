public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Java Multi-Dimensional Arrays
        int[][] myNums = {{1,2,3,4,5,6}, {7,8,9,10,11}};
        for (int i = 0; i < myNums.length; i++) {
            for (int j = 0; j < myNums[i].length; j++) {
                System.out.println(myNums[i][j]);
            }
        }
    }
}
