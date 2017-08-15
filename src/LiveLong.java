import java.util.Scanner;

public class LiveLong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        if(d/x < f){
            System.out.println(d/x);
        }else{
            int days = f + (d - f * x)/(p + x);
            System.out.println(days);
        }
    }
}
