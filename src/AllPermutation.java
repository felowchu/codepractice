import java.util.ArrayList;
import java.util.HashSet;

public class AllPermutation {
    public ArrayList<String> permutation(String str){
        ArrayList<String> list = new ArrayList<>();
        if(str.length() == 0)
            return list;
        HashSet<String> set = new HashSet<>();
        reverse(set, str.toCharArray(), 0);
        list.addAll(set);
        return list;
    }

    public void reverse(HashSet<String> set, char[] chars, int index){
        if(index == chars.length)
            set.add(String.valueOf(chars));
        for(int i = index; i < chars.length; i++){
            char temp1 = chars[i];
            chars[i] = chars[index];
            chars[index] = temp1;
            reverse(set, chars, index);
            char temp2 = chars[i];
            chars[i] = chars[index];
            chars[index] = temp2;
        }
    }
}
