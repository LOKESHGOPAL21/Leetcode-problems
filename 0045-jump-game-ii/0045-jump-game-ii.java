class Solution {
    public int jump(int[] nums) {

        
        int n = nums.length;

        if(n==1){
            return 0;
        }


        int destination = n-1;
        int coverage = 0;
        int jumps = 0;
        int lastidx = 0;

        for(int i=0;i<n;i++){
            coverage = Math.max(coverage,i+nums[i]);

            if(i==lastidx){
                lastidx = coverage;
                jumps++;

                if(coverage>=destination){
                    return jumps;
                }
            }
        }return jumps;
    }
}