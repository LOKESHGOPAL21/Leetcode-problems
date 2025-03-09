class Solution {
    public int countSubstrings(String s) {
        int count =0;

        for(int i=0;i<s.length();i++){
            int low = i;
            int high = i;

            while(low>=0 && high < s.length() && s.charAt(low)==s.charAt(high)){
                String sub = s.substring(low,high+1);
                if(sub.length()>0){
                    count ++;
                    low--;
                    high++;
                }
            }

            low = i-1;
            high = i;

            while(low>=0 && high < s.length() && s.charAt(low)==s.charAt(high)){
                String sub = s.substring(low,high+1);
                if(sub.length()>0){
                    count ++;
                    low--;
                    high++;
                }
            }
        }return count;
    }
}