class Solution(object):
    def rotateString(self, s, goal):
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        str = s+s
        if(len(s)!=len(goal)):
            return False
        return goal in str
        