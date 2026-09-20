class Solution {
    public int reverseDegree(String s) {
        int n;
        n=s.length();
        int p=0;
        for(int i=0;i<n;i++){
            p+=((int)('z'-s.charAt(i))+1)*(i+1);        }
    return p;}
}