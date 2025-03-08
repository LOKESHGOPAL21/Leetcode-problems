class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        int str1 = word1.length();
        int str2 = word2.length();

        int maxi=0;
        if(str1>str2){
            maxi=str1;
        }else{
            maxi=str2;
        }

        int i=0;
        int j=0;
        while(i<str1 && j<str2){
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;j++;
        }

        while(i<str1){
            str.append(word1.charAt(i));
            i++;
        }

        while(j<str2){
            str.append(word2.charAt(j));
            j++;
        }

        return str.toString();
    }
    
}