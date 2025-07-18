from collections import Counter
class Solution:
    def beautySum(self, s: str) -> int:
        total = 0
        str_length = len(s)
        for i in range(str_length):
            char_counter = Counter()
            for j in range(i,str_length):
                char_counter[s[j]]+=1
                curr_beauty = max(char_counter.values())-min(char_counter.values())
                total += curr_beauty
        return total