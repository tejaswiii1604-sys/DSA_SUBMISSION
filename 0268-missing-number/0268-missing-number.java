// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int expected = n * (n + 1) / 2;
//         int actual = 0;
//         for (int x : nums) actual += x;
//         return expected - actual;
//     }
// }

class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i ^ nums[i];
        }
        return res;
    }
}