class Solution(object):
    def removeOuterParentheses(self, s):
        """
        :type s: str
        :rtype: str
        """
        count = 0
        list = []
        for i in s:
            if i == "(":
                if(count>0):
                    list.append(i)
                count+=1
            elif i == ")":
                count-=1
                if(count>0):
                    list.append(i)
        return "".join(list)

        