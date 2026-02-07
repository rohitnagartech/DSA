class Solution {
    public int missingNumber(int[] nums) {
        
        // Step 1: n = size of array
        int n = nums.length;

        // Step 2: Calculate expected sum of numbers from 0 to n
        // Formula = n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;

        // Step 3: Calculate actual sum of array elements
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Step 4: Missing number = expectedSum - actualSum
        return expectedSum - actualSum;
    }
}
