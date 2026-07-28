
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        float median;
        int m = nums1.length;
        int n = nums2.length;
        int size=m+n;
        int [] new_arr = new int[size];
        System.arraycopy(nums1,0,new_arr,0,m);
        System.arraycopy(nums2,0,new_arr,m,n);
        Arrays.sort(new_arr);
        int k = size/2;
        if((size)%2==0)
        {
            return median =(new_arr[size/2 - 1] + new_arr[size/2]) / 2.0f;
            
        }
        else 
        {
            return median =new_arr[size/2];
           }   
        }
}