public class SequenceOfBST {
    public boolean verify(int[] sequence){
        if(sequence.length == 0){
            return false;
        }
        return isSequenceBST(sequence, 0, sequence.length-1);
    }

    public boolean isSequenceBST(int[] sequence, int start, int end){
        if(start >= end)
            return true;
        int value = sequence[end];
        int index = start;
        while(sequence[index] < value){
            index++;
        }
        int i = index;
        while(i < end && sequence[i] > value){
            i++;
        }
        if(i != end)
            return false;
        return isSequenceBST(sequence, start, index-1) && isSequenceBST(sequence, index, end - 1);
    }
}
