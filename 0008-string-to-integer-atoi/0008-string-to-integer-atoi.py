class Solution:
    def myAtoi(self, s: str) -> int:
        if(not s):
            return 0
        length = len(s)

        index =0
        while index < length and s[index] == " ":
            index += 1

        if(index==length):
            return 0
        sign = 1
        if(s[index]=="-"):
            sign = -1
            index+=1
        elif(s[index]=="+"):
            sign = 1
            index+=1
        result = 0
        INT_MAX = (2**31-1)
        INT_MIN = -(2**31)
        threshold = INT_MAX//10
        while(index<length and s[index].isdigit()):
            digit = int(s[index])
            if(result>threshold or (result==threshold and digit>7)):
                return INT_MAX if sign == 1 else INT_MIN
            result = result*10+digit
            index+=1

        return sign*result