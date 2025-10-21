class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         boolean canbuild = false;

        char[] charArrayRansomeNote = ransomNote.toCharArray();
        char[] charArrayMagazine = magazine.toCharArray();

        HashMap<Character, Integer> charCountMapRansomeNote
                = new HashMap<Character, Integer>();

        HashMap<Character, Integer> charCountMapMagazine = new HashMap<Character, Integer>();


        for (char c : charArrayRansomeNote) {
            if (charCountMapRansomeNote.containsKey(c)) {
                charCountMapRansomeNote.put(c, charCountMapRansomeNote.get(c) + 1);
            }
            else {
                charCountMapRansomeNote.put(c,1);
            }
        }

        for (char c : charArrayMagazine) {
            if (charCountMapMagazine.containsKey(c)) {
                charCountMapMagazine.put(c, charCountMapMagazine.get(c) + 1);
            }
            else {
                charCountMapMagazine.put(c,1);
            }
        }
        System.out.println(charCountMapMagazine);
        System.out.println(charCountMapRansomeNote);
        
        HashMap<Character, Integer> newHashMap = new HashMap<>();

        for(Map.Entry<Character, Integer> entry : charCountMapRansomeNote.entrySet()) {

            if(charCountMapMagazine.containsKey(entry.getKey())) {
                System.out.println(entry.getKey());
                char key = entry.getKey();
                int val1 = charCountMapRansomeNote.get(entry.getKey());
                int val2 = charCountMapMagazine.get(entry.getKey());

                if(val1 == val2 || val2 > val1) {
                    System.out.println(" values are equal"+ val1+ val2 );
                    newHashMap.put(key,val1);

                }
                else {
                    System.out.println("Cant build");
                }

            }

        }

        if(newHashMap.equals(charCountMapRansomeNote)) {
            canbuild = true;
        }

        return canbuild;
        
    }
}