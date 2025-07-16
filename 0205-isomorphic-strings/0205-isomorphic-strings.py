class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapST = {}
        mapTS = {}
        if(len(s)!=len(t)): return False
        for i in range(0,len(s)):
            chs = s[i]
            cht = t[i]
            if(chs in mapST):
                if(mapST[chs]!=cht):
                    return False
            else:
                mapST[chs] = cht
            if(cht in mapTS):
                if(mapTS[cht]!=chs):
                    return False
            else:
                mapTS[cht] = chs
        return True