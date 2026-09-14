class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int lef=Math.max(rec1[0],rec2[0]);
        int rig=Math.min(rec1[2],rec2[2]);
        int bot =Math.max(rec1[1],rec2[1]);
        int tp=Math.min(rec1[3],rec2[3]);
        return lef<rig && bot<tp;
    }
}