class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int longest = 0;
        for (int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num+length)){
                    length+=1;
                }
                longest = Math.max(longest,length);
            }
            

        }
        return longest;
    }
}