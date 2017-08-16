import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] num = new int[1000+1];
            for(int i = 0; i < n; i++){
                int temp = sc.nextInt();
                if(num[temp] == 0){
                    num[temp]++;
                }
            }
            for(int i = 1; i < num.length; i++){
                if(num[i] != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
