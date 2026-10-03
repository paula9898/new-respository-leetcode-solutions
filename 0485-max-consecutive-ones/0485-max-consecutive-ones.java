class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int compare = 0;

        for(int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                max++;
                if (max >= compare) {
                    compare = max;

                }

            } else if (nums[i] == 0 || nums[i] == nums.length - 1) {

                max = 0;
            }

        }
        return compare;   
    } 

}