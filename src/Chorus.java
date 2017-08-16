import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chorus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] high = new int[n];
            for (int i = 0; i < n; i++) {
                high[i] = sc.nextInt();
            }
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                dp[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (high[i] > high[j] && dp[j] >= dp[i]) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            int[] db = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                db[i] = 1;
                for (int j = n - 1; j > i; j--) {
                    if (high[i] > high[j] && db[j] >= db[i]) {
                        db[i] = db[j] + 1;
                    }
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (dp[i] + db[i] - 1 > max) {
                    max = dp[i] + db[i] - 1;
                }
            }
            System.out.println(n - max);
        }
    }
}

