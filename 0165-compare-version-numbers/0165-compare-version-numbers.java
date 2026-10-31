class Solution {
    public int compareVersion(String version1, String version2) {
        String[] version1Teile = version1.split("\\.");
        String[] version2Teile = version2.split("\\.");

        int n = version1Teile.length;
        int m = version2Teile.length;

        int len = Math.max(n,m);

        for(int i = 0; i <= len; i++) {

            int num1 = (i < n) ? Integer.parseInt(version1Teile[i]) : 0;
            int num2 = (i < m) ? Integer.parseInt(version2Teile[i]) : 0;

            if (num1 < num2)
                return -1;
            if (num1 > num2)
                return 1;

        }
        
        return 0;
    }
}