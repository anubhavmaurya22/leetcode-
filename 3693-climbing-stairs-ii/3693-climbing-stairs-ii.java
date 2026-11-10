class Solution {
    public int climbStairs(int n, int[] costs) {
        int x=0;
        int d=0,a=0,f=0;
        for (int i =0;i<n;++i){
            x = Math.min(1+costs[i]+f,Math.min(4+costs[i]+a,9+costs[i]+d));
            d=a;
            a=f;
            f=x;
        }
        return x;
    }
}