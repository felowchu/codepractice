import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String hex = sc.next();
            hex = hex.substring(2);
            int dec = Integer.valueOf(hex, 16);
            System.out.println(dec);
        }
    }
}
