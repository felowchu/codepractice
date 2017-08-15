import java.util.Scanner;

public class DealTask {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] task = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            task[i] = sc.nextInt()/1024;
            sum += task[i];
        }

        int col = sum/2;
        int[] dp = new int[col+1];

        for(int i = 1; i <=n; i++){
            for(int j = col; j >= task[i-1]; j--){
                dp[j] = Math.max(dp[j], dp[j-task[i-1]]+task[i-1]);
            }
        }
       System.out.println((sum-dp[col])*1024);
    }
}
