public class StrToInt {
    public int convert(String str){
        if(str.length() == 0)
            return 0;
        int signal = str.charAt(0) == '-' ? -1 : 1;
        if(str.charAt(0) == '+' || str.charAt(0) ==  '-')
            str = str.substring(1, str.length());
        long sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                sum = sum * 10 + signal * (str.charAt(i) - '0');
            }else
                return 0;
            if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
                return 0;
        }
        return (int)sum;
    }
}
