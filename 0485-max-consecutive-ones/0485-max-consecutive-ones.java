class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0, maxx =0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]==1){
                curr++;
                maxx = Math.max(curr, maxx);
            }else{
                curr = 0;
            }
        }
        return maxx;
    }
}