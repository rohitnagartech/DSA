class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int index = -1;
        
        // Step 1: Find largest element and its index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        
        // Step 2: Check condition
        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }
        
        return index;
    }
}