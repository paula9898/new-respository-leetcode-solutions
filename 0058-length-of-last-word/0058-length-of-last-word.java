class Solution {
    public int lengthOfLastWord(String sentence) {
         int lengthOfLastWord = 0;

        String[] words = sentence.split(" ");
        ArrayList<String> listOfwords = new ArrayList<String>();


        for(String word : words)
        {
            listOfwords.add(word);
            System.out.println(word);
        }
        for(int i = 0; i <= listOfwords.size(); i++)
        {
            if(i == listOfwords.size()-1)
            {
                System.out.println(listOfwords.get(i).length());
                lengthOfLastWord = listOfwords.get(i).length();
            }

        }

        return lengthOfLastWord;
        
    }
}