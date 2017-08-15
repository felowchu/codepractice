public class MaxOfSubArray {
    public int find(int[] array){
        if(array.length == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(sum < 0){
                sum = array[i];
            }else{
                sum += array[i];
            }
            if(sum > max)
                max = sum;
        }
        return max;
    }
}
