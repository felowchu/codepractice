public class ReOrderArray {
    public void reOrderArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if((array[i] & 1) != 0){
                int j = i;
                int temp = array[i];
                while(j > 0 && array[j - 1] % 2 == 0){
                    array[j] = array[j-1];
                    j--;
                }
                array[j] = temp;
            }
        }
    }
}
