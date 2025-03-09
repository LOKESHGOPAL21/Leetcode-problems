class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean [] state = new boolean[fruits.length];
        int count =0;
        for(int i=0;i<fruits.length;i++){
            int j=0;
            while(j<baskets.length){
                if(fruits[i]<=baskets[j] && state[j]==false){
                    count ++;
                    state[j]=true;
                    break;
                }j++;
            }
        }return fruits.length-count;
    }
}