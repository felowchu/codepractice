import java.util.Scanner;

public class PressurizedBottle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n == 0) break;
            int count = 0;
            while(n >= 3){
                count += n/3;
                n = n/3 + (n - n/3 * 3);
            }
            if(n == 2)
                count++;
            System.out.println(count);
        }
    }
}
