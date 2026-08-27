class Solution
{
    public String getPermutation(int n ,int k){
        int [] arr =new int[n+1];
        arr[0]=1;
         for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] * i;
        }

        boolean[] used =new boolean[n+1];
        StringBuilder res=new StringBuilder();
        k--;
        for (int p=n;p>=1;p--)
        {
            int s=arr[p-1];
            int t= k / s;
            k %= s;
            
            for (int n2 =1;n2<=n;n2++){
                if(used [n2])
                    continue;
                if(t ==0)
                {
                    res.append(n2);
                    used[n2]=true;
                    break;
                }
                t--;
            }

           
        }
         return  res.toString();
    }
    
}