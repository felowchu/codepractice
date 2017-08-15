import java.util.ArrayList;

public class UglyNumber {
    public int getUglyNumber(int index){
        if(index <= 0)
            return 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int result = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        while (list.size() < index){
            result = Math.min(list.get(index2)*2,Math.min(list.get(index3)*3, list.get(index5)*5));
            if(result == list.get(index2)*2){
                index2++;
            }
            if(result == list.get(index3)*3){
                index3++;
            }
            if(result == list.get(index5)*5){
                index5++;
            }
            list.add(result);
        }
        return list.get(list.size()-1);
    }
}
