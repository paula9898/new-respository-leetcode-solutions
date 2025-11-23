class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int sum = 0;

        for(int i = 0; i <= n; i++) {
            int j = i;

            if(i == 0) {
                ans[i] = sum;
            }
            else {
                while(j>0) {
                    int rest = j%2;
                    j = j / 2;
                    sum+= rest;

                }
            }
            ans[i] = sum;
            sum = 0;

        }

        return ans;
        
    }
}