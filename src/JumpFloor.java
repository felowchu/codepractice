public class JumpFloor {

    public int jump(int target){
         int before = 0;
         int after = 1;
         while(target-- > 0){
             after = before +after;
             before = after - before;
         }
         return before;
    }
}
