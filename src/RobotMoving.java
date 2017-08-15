public class RobotMoving {
    public int movingCount(int threshold, int rows, int cols){
        if(threshold < 0 || rows <= 0 || cols <= 0)
            return 0;
        boolean[][] isVisited = new boolean[rows][cols];
        return count(threshold, rows, cols, 0, 0, isVisited);
    }

    public int count(int threshold, int rows, int cols, int row, int col, boolean[][] isVisited){
        int count = 0;
        if(row >= 0 && row < rows && col >= 0 && col < cols && sum(row) + sum(col) <= threshold && !isVisited[row][col]){
            isVisited[row][col] = true;
            count = 1 + count(threshold, rows, cols, row-1, col, isVisited)
                      + count(threshold, rows, cols, row+1, col, isVisited)
                      + count(threshold, rows, cols, row, col-1, isVisited)
                      + count(threshold, rows, cols, row, col+1, isVisited);
        }
        return count;
    }

    public int sum(int a){
        int sum = 0;
        while(a > 0){
            sum += a%10;
            a = a/10;
        }
        return sum;
    }
}
