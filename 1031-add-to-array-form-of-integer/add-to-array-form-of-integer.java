class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;

        // Loop as long as there are digits in 'num' OR 'k' is still > 0
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i]; // Add the array digit to k
            }
            
            ans.add(k % 10); // Extract the last digit of the sum
            k /= 10;         // k now acts as the 'carry' for the next position
            i--;
        }

        Collections.reverse(ans);
        return ans;
    }
}