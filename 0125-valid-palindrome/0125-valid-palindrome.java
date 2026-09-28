class Solution {
    public boolean isPalindrome(String s) {
         String newString = s.replace("\\s+","").toLowerCase();
        String newStringWithoutNonAlphanumeric = newString.replaceAll(
                "[^a-zA-Z0-9]", "");

        System.out.println(newStringWithoutNonAlphanumeric);
        StringBuilder sb1 = new StringBuilder();

        int length = newStringWithoutNonAlphanumeric.length();
        System.out.println(length);

        for(int i = newStringWithoutNonAlphanumeric.length()-1; i>=0; i--) {
            sb1.append(newStringWithoutNonAlphanumeric.charAt(i));
        }

        String reversedString = sb1.toString();
        System.out.println(reversedString);

        return newStringWithoutNonAlphanumeric.equals(reversedString);
    }
}