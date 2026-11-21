class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int min = 0;
        int max = rows * columns - 1;
        int mid = 0;

        while (min <= max) {
            mid = min + (max - min) / 2;
            int row = mid / columns;
            int column = mid % columns;

            if (target == matrix[row][column]) {
                return true;
            }
            if (target > matrix[row][column]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }

        }
        return false;
    }
}