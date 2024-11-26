class Solution {
   public int[] twoSum(int[] nums, int target) {

        //nums = [2,7,11,15];


        int[] result = new int[2];

        for(int i = 0; i< nums.length-1; i++)
        {

            int holder;

            for(int a = i+1;a< nums.length; a++)
            {
                holder = nums[i];
                if(holder + nums[a] == target)
                {
                    result[0]= i;
                    result[1]= a;
                }

            }


        }
        for( int j : result)
        {
            System.out.println(j);
        }

        return result;

    }
}