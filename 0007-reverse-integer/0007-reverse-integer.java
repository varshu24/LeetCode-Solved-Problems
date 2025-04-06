class Solution {
    public int reverse(int num) {
        int dig=0;
        int res=0;
        int val=0;
        int rev=0;
        while(num!=0){
            dig=num%10;
            num/=10;
        
        if(rev<Integer.MIN_VALUE/10 ||(rev==Integer.MIN_VALUE/10 && dig<-8)){
            return 0;
        }
        if(rev>Integer.MAX_VALUE/10 ||(rev==Integer.MAX_VALUE/10 && dig>7)){
            return 0;
        }
        rev=rev*10+dig;
        }
    

        return rev;
    }
}