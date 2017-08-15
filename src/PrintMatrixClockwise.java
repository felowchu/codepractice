import java.util.ArrayList;

public class PrintMatrixClockwise {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        while(start * 2 < rows && start * 2 < cols){
            for(int i = start; i <= cols-start-1; i++){
                list.add(matrix[start][i]);
            }
            if(rows - 2*start - 1 > 0){
                for(int i = start + 1; i <= rows-start-1; i++){
                    list.add(matrix[i][cols - start - 1]);
                }
            }
            if(rows - 2*start - 1 > 0 && cols - 2*start - 1 > 0){
                for(int i = cols - start - 2; i >= start; i--){
                    list.add(matrix[rows-start-1][i]);
                }
            }
            if(rows - 2*start - 2 > 0 && cols - 2*start -1 > 0){
                for(int i = rows-start-2; i > start; i--){
                    list.add(matrix[i][start]);
                }
            }
            start++;
        }
        return list;
    }
}
