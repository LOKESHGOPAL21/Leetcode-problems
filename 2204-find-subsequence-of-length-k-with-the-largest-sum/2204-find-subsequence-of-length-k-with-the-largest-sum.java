import java.util.*;
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [][] mat = new int[nums.length][2];
        for(int i = 0;i<nums.length;i++){
            mat[i][0]=i;
            mat[i][1]=nums[i];
        }

        Arrays.sort(mat,(x1,x2)->Integer.compare(x2[1],x1[1]));

        Arrays.sort(mat,0,k,(x1,x2)->Integer.compare(x1[0],x2[0]));

        int [] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=mat[i][1];
        }


        return res;
    }
}