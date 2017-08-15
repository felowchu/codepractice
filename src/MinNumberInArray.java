public class MinNumberInArray {

    public static void main(String[] args){

    }
    public int minNumberInRotateArray(int[] array){
        if(array.length == 0)
            return 0;
        int start = 0;
        int end = array.length-1;
        while(end > start + 1){
            int mid = (start + end)/2;
            if(array[mid] == array[start] && array[mid] == array[end]){
                int res = Integer.MAX_VALUE;
                for(int i = start; i <= end; i++){
                    if(array[i] < res)
                        res = array[i];
                }
                return res;
            }
            else if(array[mid] >= array[start]){
                start = mid;
            }else if(array[mid] <= array[end]){
                end = mid;
            }
        }
        return array[end];
    }
}
