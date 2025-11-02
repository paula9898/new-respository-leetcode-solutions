class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<String, Integer> wordOneHashmap = new HashMap<>();
        HashMap<String, Integer> wordTwoHashmap = new HashMap<>();
     
        wordTwoHashmap.put(String.valueOf(s.charAt(0)),1);

        for(int i = 1; i < s.length(); i++) {

            if(wordTwoHashmap.containsKey(String.valueOf(s.charAt(i)))) {
                wordTwoHashmap.put(String.valueOf(s.charAt(i)), wordTwoHashmap.get(String.valueOf(s.charAt(i))) + 1);
            }
            else {
                wordTwoHashmap.put(String.valueOf(s.charAt(i)), 1);
            }
        }

        wordOneHashmap.put(String.valueOf(t.charAt(0)),1);
        for(int i = 1; i < t.length(); i++) {

            if(wordOneHashmap.containsKey(String.valueOf(t.charAt(i)))) {
                wordOneHashmap.put(String.valueOf(t.charAt(i)), wordOneHashmap.get(String.valueOf(t.charAt(i))) + 1);
            }
            else {
                wordOneHashmap.put(String.valueOf(t.charAt(i)), 1);
            }
        }

        return wordTwoHashmap.equals(wordOneHashmap);
        
    }
}