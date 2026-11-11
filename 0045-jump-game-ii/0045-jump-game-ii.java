class Solution {
    public int jump(int[] nums) {
        int g=0;
        int count=0;
        int c=0;
        for (int i=0;i<nums.length-1;i++)
        {
            g=Math.max(g,i+nums[i]);

            if(i==c){
                count++;
                c=g;
                if(c>=nums.length-1)
                    break;
            }

        }
        return count;
    }
}