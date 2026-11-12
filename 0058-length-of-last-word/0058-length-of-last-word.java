class Solution {
    public int lengthOfLastWord(String s) {
        int p=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            p++;
        
        else {
            if(p>0)
            return p;
            
        }}
        return p;
    }
}