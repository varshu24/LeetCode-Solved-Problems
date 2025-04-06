class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int cur=0;
        int pre1=1;
        int pre2=2;
        for(int i=3;i<=n;i++){
            cur=pre1+pre2;
            pre1=pre2;
            pre2=cur;
        }
        return pre2;
        
    }
}