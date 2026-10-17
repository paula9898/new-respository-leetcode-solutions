class Solution {
    public int trailingZeroes(int n) {
        int rest = 0;
        int sum = 0;
        int k = 1;

        if(n < 5) {
            sum = 0;
        }

        else {
            while((int)Math.pow(5,k) <= n) {
                rest = n / (int)Math.pow(5,k);
                sum+= rest;
                k++;

            }
        }

        return sum;
    }
}