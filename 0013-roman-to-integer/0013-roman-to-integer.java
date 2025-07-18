class Solution {
    public int romanToInt(String s) {
        String str = "IVXLCDM";
        HashMap<Character,Integer> map = new HashMap<>();

        int [] numericals = {1,5,10,50,100,500,1000};

        for(int i =0;i<str.length();i++){
            map.put(str.charAt(i),numericals[i]);
        }

        int total = map.get(s.charAt(s.length()-1));
        for(int i =0;i<s.length()-1;i++){
            int sign = map.get(s.charAt(i))<map.get(s.charAt(i+1)) ? -1:1;
            total += sign*map.get(s.charAt(i));
        }
        return total;
    }
}