class NumArray {
    private int [] pre_sum ;
    public NumArray(int[] nums) {
        int n = nums.length;
        pre_sum = new int [n+1];
        for(int i =0;i<n;i++){
            pre_sum[i+1] = pre_sum[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return pre_sum[right+1]-pre_sum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */