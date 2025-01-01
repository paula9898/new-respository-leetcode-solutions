class Solution {
    public int mySqrt(int number) {
        int low = 1;
        int x = number;
        int high = x;
      
      
     
      while (low <= high) {
         int mid = low + (high - low) / 2;
         long square = (long) mid * mid;
         if (square == x) {
            return mid;
         } else if (square < x) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
         
      }
      
      return high;
        
    }
}