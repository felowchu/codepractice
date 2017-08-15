public class RectCover {

    public int RectCover(int target){
        if(target <= 0)
            return 0;
        int before = 1;
        int after = 1;
        while(--target > 0){
            after = after + before;
            before = after - before;
        }
        return after;
    }
}
