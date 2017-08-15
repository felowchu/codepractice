import java.util.Scanner;

public class MinTime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] site = new int[n][2];
        for(int i = 0; i < n; i++){
            site[i][0] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            site[i][1] = sc.nextInt();
        }

        int gx = sc.nextInt();
        int gy = sc.nextInt();

        int wt = sc.nextInt();
        int tt = sc.nextInt();

        int walktime = (Math.abs(gx)+Math.abs(gy))*wt;

        int minTaxiTime = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int time = (Math.abs(site[i][0])+Math.abs(site[i][1]))*wt + (Math.abs(site[i][0] - gx)+Math.abs(site[i][1]-gy))*tt;
            if(time < minTaxiTime)
                minTaxiTime = time;
        }
        System.out.println(Math.min(walktime, minTaxiTime));
    }
}
