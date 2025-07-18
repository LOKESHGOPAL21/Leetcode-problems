class Solution:
    def romanToInt(self, s: str) -> int:
        dict = {"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        total = dict[s[len(s)-1]]
        for ch in range(0,len(s)-1):
            sign = -1 if dict[s[ch]]<dict[s[ch+1]] else 1
            total +=sign*dict[s[ch]]
        return total