public class RegExp {
    public static void main(String[] args){
        String str = "";
        String pattren = ".*";
        System.out.println(match(str.toCharArray(), pattren.toCharArray()));
    }
    public static boolean match(char[] str, char[] pattern){
        return match0(str, 0, pattern, 0);
    }

    public static boolean match0(char[] str, int sLen, char[] pattern, int pLen){
        if(sLen == str.length && pLen == pattern.length){
            return true;
        }
        if(pLen == pattern.length && sLen != str.length){
            return false;
        }
        if(pLen < pattern.length - 1 && pattern[pLen + 1] == '*'){
            if(sLen < str.length && (pattern[pLen] == '.' || pattern[pLen] == str[sLen])){
                return match0(str, sLen, pattern, pLen+2) ||
                        match0(str, sLen+1, pattern, pLen);
            }else{
                return match0(str, sLen, pattern, pLen+2);
            }
        }
        if(sLen < str.length && (pattern[pLen] == '.' || pattern[pLen] == str[sLen])){
            return match0(str, sLen+1, pattern, pLen+1);
        }
        return false;
    }
}
