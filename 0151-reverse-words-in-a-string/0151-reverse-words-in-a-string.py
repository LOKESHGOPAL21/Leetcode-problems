class Solution:
    def reverseWords(self, s: str) -> str:
        lst = s.strip().split()
        low = 0
        high = len(lst)-1
        while(low<=high):
            temp = lst[low]
            lst[low] = lst[high]
            lst[high] = temp
            low+=1
            high-=1
        return " ".join(lst)