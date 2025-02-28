class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanNumbers = new HashMap<String, Integer>();

        romanNumbers.put("I",1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L",50);
        romanNumbers.put("C",100);
        romanNumbers.put("D",500);
        romanNumbers.put("M",1000);

        int totalSum = 0;
        int doubleNum = 0;

        String[] res = new String[s.length()];
        int[] numbers = new int[s.length()];
        int[] numbersTwo = new int[numbers.length];

        for (int i = 0; i < s.length(); i++) {
            res[i] = Character.toString(s.charAt(i));
        }

        for (int i = 0; i < res.length; i++)
        {
            for (String j : romanNumbers.keySet()) {

                if(Objects.equals(res[i], j))
                {
                    romanNumbers.get(j);
                    numbers[i] = romanNumbers.get(j);
                }
            }

        }
        System.out.println(Arrays.toString(numbers));
        for(int num = 0; num < numbers.length; num++)
        {
            if(num < numbers.length - 1 && numbers[num] == 1 && numbers[num+1] == 5)
            {
                int diff = numbers[num+1] - numbers[num];
                doubleNum= numbers[num+1];
                numbersTwo[num] = diff;
                totalSum += diff;


            }

            else if(num < numbers.length - 1 && numbers[num] == 1 && numbers[num+1] == 10)
            {
                int diff = numbers[num+1] - numbers[num];
                doubleNum= numbers[num+1];
                numbersTwo[num] = diff;
                totalSum += diff;

            }
            else if(num < numbers.length - 1 && numbers[num] == 10 && numbers[num+1] == 50)
            {
                int diff = numbers[num+1] - numbers[num];
                doubleNum= numbers[num+1];
                numbersTwo[num] = diff;
                totalSum += diff;


            }
            else if(num < numbers.length - 1 && numbers[num] == 10 && numbers[num+1] == 100)
            {
                int diff = numbers[num+1] - numbers[num];
                doubleNum= numbers[num+1];
                numbersTwo[num] = diff;
                totalSum += diff;

            }
            else if(num < numbers.length - 1 && numbers[num] == 100 && numbers[num+1] == 500)
            {
                int diff = numbers[num+1] - numbers[num];
                doubleNum= numbers[num+1];
                numbersTwo[num] = diff;
                totalSum += diff;

            }

            else if(num < numbers.length - 1 && numbers[num] == 100 && numbers[num+1] == 1000)
            {
                int diff = numbers[num+1] - numbers[num];
                doubleNum= numbers[num+1];
                numbersTwo[num] = diff;
                totalSum += diff;

            }
            else {
                ///sumNew += numbers[num];
                totalSum += numbers[num];
                totalSum -= doubleNum;
                doubleNum = 0;
                numbersTwo[num] = numbers[num];
            }


        }
        System.out.println(totalSum);

        System.out.println(Arrays.toString(numbersTwo));

        return totalSum;


    }
}