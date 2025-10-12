class Solution {
     public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;
        for(int i = m; i < nums1.length; i++) {
            nums1[m] = nums2[j];
            j += 1;
            m++;
        }
        for(int i = 1; i < nums1.length; i++) {

            int k = nums1[i];
            int x = i-1;

            while(x >= 0  && nums1[x] > k ) {
                nums1[x + 1] = nums1[x];
                x = x -1;
            }
            nums1[x + 1] = k;
        }
        System.out.println(Arrays.toString(nums1));
    }

}  