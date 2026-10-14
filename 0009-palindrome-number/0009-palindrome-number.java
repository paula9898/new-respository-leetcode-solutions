class Solution {
    public boolean isPalindrome(int x) {
        String convertedInt = String.valueOf(x);
        StringBuilder newBuilder = new StringBuilder();

        for(int i = convertedInt.length()-1; i >= 0; i-- ) {
            newBuilder.append(convertedInt.charAt(i));
        }

        String reversedWord = newBuilder.toString();

        return reversedWord.equals(convertedInt);
        
    }
}