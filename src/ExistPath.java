public class ExistPath {
    int pLen = 0;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        if(matrix.length < str.length)
            return false;
        boolean[][] inVisited = new boolean[rows][cols];
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(matrix[row * cols + col] == str[0]){
                    if(findPath(matrix, row, col, rows, cols, str, inVisited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean findPath(char[] matrix, int row, int col, int rows, int cols, char[] str, boolean[][] isVisited){
        if(pLen == str.length)
            return true;
        boolean result = false;
        if(row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[pLen] && !isVisited[row][col]){
            pLen++;
            isVisited[row][col] = true;
            result = findPath(matrix, row-1, col, rows, cols, str, isVisited) ||
                     findPath(matrix, row+1, col, rows, cols, str, isVisited) ||
                     findPath(matrix, row, col-1, rows, cols, str, isVisited) ||
                     findPath(matrix, row, col+1, rows, cols, str, isVisited);
            if(!result){
                pLen--;
                isVisited[row][col] = false;
            }
        }
        return result;
    }
}
