class Solution {
    public String largestOddNumber(String num) {
        int index = num.length()-1;
        while(index>=0){
            int res = num.charAt(index)-'0';
            if(res%2==1){
                return num.substring(0,index+1);
            }
            index--;
        }
        return "";
    }
}