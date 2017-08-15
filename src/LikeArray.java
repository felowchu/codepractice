import java.util.Scanner;
/*取模为0的情况 8:4 9:3 6:3 8:2 6:2 4:2 9:1 8:1 7:1 6:1 5:1 4:1 3:1 2:1*/
public class LikeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = 1;
        }
       int count = 1;
        while(arr[0] < k+1){
            int j = n-1;
            arr[n-1] += 1;
            boolean valid = true;
            while(j>0 && arr[j] == k+1){
                arr[j] = 1;
                arr[j-1] += 1;
                valid = (valid & (arr[j-1] <= arr[j] || arr[j - 1]%arr[j] != 0) );
                j--;
            }
            if(valid && arr[0] < k+1) count++;
            if(count > 1000000007) count %= 1000000007;
        }
        System.out.println(count);
    }
}
