class Solution:
    def longestPalindrome(self, s: str) -> str:
        if(len(s)<=1):
            return s
        lps = ""
        for i in range(1,len(s)):
            low = i
            high = i
            while(s[low]==s[high]):
                low-=1
                high+=1

                if(low==-1 or high == len(s)):
                    break
            substr = s[low+1:high]
            if(len(substr)>len(lps)):
                lps = substr
            
            low = i-1
            high = i
            while(s[low]==s[high]):
                low-=1
                high+=1
                if(low == -1 or high == len(s)):
                    break
                
            substr = s[low+1:high]
            if(len(substr)>len(lps)):
                lps = substr
        return lps