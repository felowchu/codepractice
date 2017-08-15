public class FindNumMoreThanHalf {
    public int find(int[] array){
        if(array.length == 0)
            return 0;
        int res = array[0];
        int count = 1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == res && count > 0){
                count++;
            }else if(count == 0){
                count = 1;
                res = array[i];
            }else{
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == res)
                count++;
        }
        if(count*2 > array.length)
            return res;
        else
            return 0;
    }
}
