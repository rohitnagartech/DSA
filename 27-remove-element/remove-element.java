class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;   // pointer to store valid elements

        // enhanced for loop (for-each)
        for (int num : nums) {

            // if current element is not equal to val
            if (num != val) {
                nums[k] = num;  // place valid element
                k++;            // move pointer forward
            }
        }

        return k;   // new length after removal
    }
}
