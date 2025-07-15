class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        list = [x for x in s.strip().split() if x]
        return " ".join(list[::-1])

        