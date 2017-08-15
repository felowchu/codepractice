public class NumberOf1 {
    public int count(int n){
        int count = 0;
        while(n != 0){
            count++;
            n &= (n - 1);
        }
        return count;
    }
}
