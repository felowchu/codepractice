import java.util.Scanner;

public class CharacterSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            String[] map = new String[26];
            for(int i = 0; i < map.length; i++){
                map[i] = "";
            }
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                    char c1 = Character.toLowerCase(c);
                    map[c1-'a'] += c;
                }
            }
            String s = "";
            for(int i = 0; i < map.length; i++){
                s += map[i];
            }
            String res = "";
            int j = 0;
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                   res += s.charAt(j++);
                }else {
                    res += c;
                }
            }
            System.out.println(res);
        }
    }
}
