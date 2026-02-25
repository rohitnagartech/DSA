class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];  // since max value is 500
        
        // Count frequency
        for (int num : arr) {
            freq[num]++;
        }
        
        int result = -1;
        
        // Check for lucky numbers
        for (int i = 1; i <= 500; i++) {
            if (freq[i] == i) {
                result = i;  // keep largest
            }
        }
        
        return result;
    }
}