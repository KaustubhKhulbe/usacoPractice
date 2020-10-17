package Not_USACO.LeetCode;

public class searchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i].length != 0 && matrix[i][matrix[i].length - 1] >= target){
                for(int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j] == target) return true;
                }
                break;
            }
        }
        return false;
    }
}
