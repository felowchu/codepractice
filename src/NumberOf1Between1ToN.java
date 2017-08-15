public class NumberOf1Between1ToN {
    public int numberOf1(int n){
        int count = 1;
        for(int i = 0; i < n; i *= 10){
            int a = n%i;
            int b = n/i;
            count += ((b+8)/10*i + (b%10 == 1 ? (a+1) : 0));
        }
        return count;
    }
}
