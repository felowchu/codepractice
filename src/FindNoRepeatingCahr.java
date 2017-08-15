public class FindNoRepeatingCahr {
    public int firstNotReapeating(String str){
        int[] map = new int[128];
        for(int i = 0; i < 128; i++){
            map[i] = -1;
        }
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
           if(map[chars[i]] == -1){
               map[chars[i]] = i;
           }else {
               map[chars[i]] = -2;
           }
        }
        int res = -1;
        for(int i = 0; i < 128; i++){
            if(map[i] >= 0 && (map[i] < res || res == -1)){
                res = map[i];
            }
        }
        return res;
    }
}
