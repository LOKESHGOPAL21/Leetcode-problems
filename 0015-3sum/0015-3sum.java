class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=i+1,r=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(l<r){
                int threesum = nums[i]+nums[l]+nums[r];
                if(threesum<0) l++;
                else if(threesum>0) r--;
                else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                }
            }
        }
        return res;
    }
}