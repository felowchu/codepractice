public class Fibonacci {
    public int fibobacci(int n){
        int before = 0;
        int after = 1;
        while(--n > 0){
            after = before + after;
            before = after - before;
        }
        return after;
    }
}
