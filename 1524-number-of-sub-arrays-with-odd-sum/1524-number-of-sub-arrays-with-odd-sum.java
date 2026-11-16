class Solution {
    public int numOfSubarrays(int[] arr) {
        
        long ans =0;
        long mod =1000000007;
        long od=0;
        int ev=1;
        long sum=0;
        for (int i:arr)
        {
            sum+=i;
            if(sum%2==0)
            {
                ans =(ans+od)%mod;
                ev++;
            }
                else
                {
                    ans =(ans+ev)%mod;
                    od++;
                }

            

        }
        return (int)ans;
    }
}