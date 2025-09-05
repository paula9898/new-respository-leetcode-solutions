class Solution {
    public int reverseBits(int n) {

        String paddedWithZero = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        StringBuilder sb = new StringBuilder(paddedWithZero);
        StringBuilder reversedSb = sb.reverse();
        int sumForList = 0;
        List<String> listOfBBitsFirstNumber = new ArrayList<>();

        for(int i = 0; i< reversedSb.length();i++) {
            listOfBBitsFirstNumber.add(String.valueOf(sb.charAt(i)));
        }
        int a = reversedSb.length();
        for (int i = 0; i < a; i++) {
            int power= a-1-i;
            int bit = reversedSb.charAt(i) - '0';;
            int value =  (int) Math.pow(2, power) * bit;
            sumForList += value;

        }
        System.out.println(sumForList);

        return  sumForList;
    }
}