class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         int[] emptyArray = new int[]{};

        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j < nums.length; j++) {

                int sum = nums[i] + nums[j];

                if(sum == target) {
                    int[] numbers = { i, j };
                    return numbers;
                }
            }

        }
        return emptyArray;
    }
}