class Solution {
    public String digitSum(String s, int k) {
        while (s.length()>k)
        {
            int n=s.length();
            StringBuilder pd=new StringBuilder(s);
            for(int i=0;i<k;i++)
                pd.append("0");

            StringBuilder ne=new StringBuilder();
            for(int i=0;i<n;i+=k)
            {
                int an=0;
                for(int j=i;j<i+k;j++)
                    an += pd.charAt(j) - '0';
                 ne.append(an);
                
                s=ne.toString();
            }
        }
        return s;
    }
}