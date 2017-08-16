import java.util.Scanner;

public class LongestValidPPassword {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String password = sc.next();
            int len = 0;
            for(int i = 0; i < password.length(); i++){
                int len1 = find(password, i, i);
                int len2 = find(password, i, i+1);
                len = Math.max(len, Math.max(len1, len2));
            }
            System.out.println(len);
        }
    }

    public static int find(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
