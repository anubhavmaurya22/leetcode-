class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> res=new ArrayList<>();
        int t=0;
        int l=0;
        int bot=matrix.length-1;
        int r=matrix[0].length-1;
        while (t<=bot && l<=r){
            for (int j=l;j<=r;j++){
            res.add(matrix[t][j]);}
        t++;
            for (int i=t;i<=bot;i++){
            res.add(matrix[i][r]);
            }
        r--;
            if(t<=bot){
                for (int j=r;j>=l;j--)
                {
                    res.add(matrix[bot][j]);
                }
                bot--;
            }
            if(l<=r)
            {
                for(int i=bot;i>=t;i--)
                res.add(matrix[i][l]);
            }
            l++;
        }
        return res;
    }
}