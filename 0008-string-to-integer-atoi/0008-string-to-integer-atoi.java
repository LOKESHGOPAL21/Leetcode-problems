class Solution {
    public int myAtoi(String s) {
        if(s == null){
            return 0;
        }
        int length = s.length();
        if(length==0){
            return 0;
        }
        int index = 0;
        while(index<length && s.charAt(index)==' '){
            index++;
        }

        if(index==length){
            return 0;
        }
        int sign  = 1;


        if(s.charAt(index)=='-'){
            sign = -1;
            index++;
        }else if(s.charAt(index)=='+'){
            index++;
        }
        int result = 0;
        int threshold = Integer.MAX_VALUE/10;
        while(index<length){
            char ch = s.charAt(index);
            if(ch<'0'||ch>'9'){
                break;
            }

            if(result>threshold || (result==threshold && ch>'7')){
                return sign ==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result = result*10 + (ch-'0');
            index++;

        }return sign*result;
    }
}