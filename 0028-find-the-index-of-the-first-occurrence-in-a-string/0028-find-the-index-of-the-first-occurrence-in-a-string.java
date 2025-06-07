class Solution {
    public int strStr(String haystack, String needle) {

        int k = 0;
        if (needle.length() > haystack.length()) {
            k = -1;
        }

        else {

            for(int i = 0; i <= haystack.length() - needle.length(); i++) {

                String result  = haystack.substring(i,i + needle.length());

                if (result.equals(needle)) {
                    System.out.println(i);
                    k = i;
                    break;
                }

                else {
                    k = -1;
                }
            }

        }
        return k;
    }
}