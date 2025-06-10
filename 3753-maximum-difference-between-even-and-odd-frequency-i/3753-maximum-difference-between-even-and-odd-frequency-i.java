class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int odd = Integer.MIN_VALUE;
        int eve = Integer.MAX_VALUE;

        for(char ch : s.toCharArray()){
            if(freq.get(ch)%2==1){
                odd = Math.max(freq.get(ch),odd);
            }else if(freq.get(ch)%2==0){
                eve = Math.min(freq.get(ch),eve);
            }
            
        }return odd-eve;
    }
}