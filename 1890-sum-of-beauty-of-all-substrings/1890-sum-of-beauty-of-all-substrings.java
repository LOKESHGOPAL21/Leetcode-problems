class Solution {
    public int beautySum(String s) {
        int str_length = s.length();
        int total = 0;
        for(int i=0;i<str_length;i++){
            int [] counter = new int[26];
            for(int j =i;j<str_length;j++){
                counter[s.charAt(j)-'a']++;

                int maxFrequency = 0;
                int minFrequency = 1000;
                for (int freq : counter){
                    if(freq>0){
                         maxFrequency = Math.max(freq,maxFrequency);
                        minFrequency = Math.min(freq,minFrequency);
                    }
                   
                }
                total += maxFrequency-minFrequency;
            }
        }return total;
    }
}