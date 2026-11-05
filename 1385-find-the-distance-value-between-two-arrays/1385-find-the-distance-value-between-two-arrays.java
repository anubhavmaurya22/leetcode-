class Solution
{
    public int findTheDistanceValue (int [] arr1,int[]arr2, int d){
        int c=0;
        for (int m : arr1){
            if(isValid(m,arr2,d)) c++;
        }
        return c;
        }
        boolean isValid(int s,int []arr,int d){
            for (int p:arr){
                if(Math.abs(p-s)<=d) return false;
                    }
                return true;
        }
        
    }
