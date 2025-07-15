class Solution {
    public String reverseWords(String s) {

        String words[] =s.trim().split("\\s+");
        int i=0;
        int n=words.length-1;
        while(i<=n){
            String word = words[i];
            words[i]=words[n];
            words[n]=word;
            i++;
            n--;
        }return String.join(" ",words);
    }
}