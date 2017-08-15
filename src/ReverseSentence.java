public class ReverseSentence {
    public String ReverseSentence(String str){
        String temp = "";
        String res = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                res = ' ' + temp + res;
                temp = "";
            }else {
                temp += str.charAt(i);
            }
        }
        if(temp.length() != 0){
            res = temp + res;
        }
        return res;
    }
}
