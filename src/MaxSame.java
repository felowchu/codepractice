import java.util.Scanner;

public class MaxSame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            char[] num1 = a.toCharArray();
            char[] num2 = b.toCharArray();
            if(num1.length != num2.length){
                System.out.println(-1);
                System.exit(1);
            }
            for(int i = 0; i < num1.length; i++){
                if(!Character.isDigit(num1[i]) || !Character.isDigit(num2[i])){
                    System.out.println(-1);
                    System.exit(1);
                }
            }
            int maxLen = 0;
            int count = 0;
            for(int i = 0; i < num1.length; i++){
                if(num1[i] == num2[i]){
                    count++;
                    maxLen = Math.max(maxLen, count);
                }else{
                    count = 0;
                }
            }
            if(maxLen == 1){
                System.out.println(0);
            }else {
                System.out.println(maxLen);
            }
        }
    }
}
