class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        map1 = {}
        map2 = {}
        if(len(s)!=len(t)):
            return False
        for i in range(len(s)):
            map1[s[i]]=map1.get(s[i],0)+1
            map2[t[i]]=map2.get(t[i],0)+1
        return map1==map2