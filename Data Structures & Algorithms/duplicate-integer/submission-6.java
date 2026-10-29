class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasDuplicate = false;
        for(int i = 0; i < nums.length; i++ ) {
            for (int compare = i +1; compare < nums.length; compare++) {
                if (nums[i] == nums[compare]) {
                    hasDuplicate = true;
                    continue;
                }
            }
        }
        return hasDuplicate;
    }
}