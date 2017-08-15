import java.util.Scanner;

public class AdjustFormation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String queue = sc.next();
        char[] que = queue.toCharArray();
        int nf = 0, nr = 0;
        int sf = 0, sr = 0;
        for(int i = 0; i < queue.length(); i++){
            if(que[i] == 'G'){
                nf++;
            }else{
                sf += nf;
            }
        }
        for(int i = queue.length() - 1; i >=0; i--){
            if(que[i] == 'G'){
                nr++;
            }else{
                sr += nr;
            }
        }
        System.out.println(Math.min(sf, sr));
    }
}
