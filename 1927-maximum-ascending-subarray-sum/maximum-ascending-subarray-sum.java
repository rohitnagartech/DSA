class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];   // continue increasing subarray
            } else {
                currentSum = nums[i];    // reset
            }
            
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}