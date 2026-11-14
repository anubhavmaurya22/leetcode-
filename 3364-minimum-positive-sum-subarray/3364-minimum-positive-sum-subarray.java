class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int a = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            int sum = 0;

            for (int j = 0; j < i; j++) 
                sum += nums.get(j);

            if ((sum > 0) && (sum < a)) 
                a = sum;

            for (int j = 1; j <= nums.size() - i; j++) {
                sum += nums.get(j + i - 1);
                sum -= nums.get(j - 1);

                if ((sum > 0) && (sum < a)) 
                    a = sum;
            }
        }

        return (a == Integer.MAX_VALUE) ? -1 : a;
    }
}