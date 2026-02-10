class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;                         // pointer at start of array
        int right = numbers.length - 1;      // pointer at end of array

        while (left < right) {               // loop until both pointers meet

            int sum = numbers[left] + numbers[right]; // sum of two elements

            if (sum == target) {             // if sum matches target
                return new int[]{left + 1, right + 1}; // return 1-based indices
            }
            else if (sum < target) {         // if sum is smaller than target
                left++;                      // move left pointer to increase sum
            }
            else {                           // if sum is greater than target
                right--;                     // move right pointer to decrease sum
            }
        }

        return new int[]{};                  // no result (will never happen here)
    }
}
