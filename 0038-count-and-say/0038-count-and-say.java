class Solution {
    public String countAndSay(int n) {
        String curr="1";
        if(n==1)
        return curr;

        for (int i=2;i<=n;i++)
        {
            StringBuilder sf=new StringBuilder();
            int cnt=1;
            char ele =curr.charAt(0);
            for (int j=1;j<curr.length();j++){
            char currChar = curr.charAt(j);
            
                if (currChar == ele)
                cnt++;
                else {
                    sf.append(cnt).append(ele);
                    ele=currChar;
                    cnt=1;
                }
            }
            sf.append(cnt).append(ele);
            curr=sf.toString();
        }
        return curr;
        
    }
} 