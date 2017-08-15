import java.util.HashSet;
import java.util.Scanner;

public class RemoveRepetitionElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        HashSet<Integer> set = new HashSet<>();
        String str = "";
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        for(int i = n-1; i >= 0; i--){
            if(!set.contains(num[i])){
                str = num[i] + " " + str;
                set.add(num[i]);
            }
        }
        System.out.println(str.trim());
    }
}
