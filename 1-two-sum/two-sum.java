class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>(); // store number → index

        for (int i = 0; i < nums.length; i++) { // loop through array

            int need = target - nums[i]; // value needed to reach target

            if (map.containsKey(need)) { // check if needed value exists
                return new int[] { map.get(need), i }; // return indices
            }

            map.put(nums[i], i); // store current number with index
        }

        return new int[] {}; // no result (won't happen here)
    }
}
