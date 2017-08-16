import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] score = new int[n];
        for(int i = 0; i < n; i++){
            score[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            String operate = sc.next();
            int a = sc.nextInt(), b = sc.nextInt();
            if(operate.equals("U")){
                score[a-1] = b;
            }else{
                int max = score[a-1];
                for(int j = a; j < b; j++){
                    if(score[j] > max){
                        max = score[j];
                    }
                }
                System.out.print(max+" ");
            }
        }
    }
}
