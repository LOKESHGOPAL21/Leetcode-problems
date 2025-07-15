class Solution(object):
    def largestOddNumber(self, num):
        """
        :type num: str
        :rtype: str
        """
        index = len(num)-1
        while(index>=0):
            res = int(num[index])
            if(res%2==1):
                return num[0:index+1]
            index-=1
        return ""
        