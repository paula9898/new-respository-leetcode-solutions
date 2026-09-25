class Solution {
    public int singleNumber(int[] nums) {
         int number = 0;


        HashMap<Integer, Integer> uniqeNumbers= new HashMap<>();
        

        uniqeNumbers.put(nums[0],1);


        for(int i = 1; i < nums.length; i++) {

            if(uniqeNumbers.containsKey(nums[i])) {
                uniqeNumbers.put(nums[i], uniqeNumbers.get(nums[i])+ 1);
            }
            else {
                uniqeNumbers.put(nums[i],1);
            }

        }

        for(Integer key : uniqeNumbers.keySet()) {
            if(uniqeNumbers.get(key) == 1) {
                return key;
            }

            number = key;
        }

        return number;
    }
}