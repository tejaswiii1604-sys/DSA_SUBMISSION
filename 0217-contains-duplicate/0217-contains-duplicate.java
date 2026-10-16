// // 1. Bruteforce : TC-O(n^2), SC-O(1)
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }

//         }
//     return false;
//     }
// }

// //2. Better: TC-O(nlogn), SC-O(1)
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) return true;
//         }
//         return false;
//     }
// }    


//3. optimal: TC-O(n), SC-O(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int n:nums){
            if(hs.add(n)) continue;
               return true;
        }
        return false;

        // for(int n:nums){
        //     if(hs.contains(n)){
        //         return true;
        //     }
        //     hs.add(n);
        // }
        // return false;
    }
} 