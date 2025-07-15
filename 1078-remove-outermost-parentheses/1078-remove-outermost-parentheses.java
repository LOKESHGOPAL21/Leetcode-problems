class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(count>0){
                    str.append(ch);
                }
                count++;
            }else if(ch==')'){
                count--;
                if(count>0){
                    str.append(ch);
                }
            }
        }return str.toString();
    }
}