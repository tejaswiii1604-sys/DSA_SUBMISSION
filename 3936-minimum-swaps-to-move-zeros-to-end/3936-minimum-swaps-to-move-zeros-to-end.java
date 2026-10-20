// class Solution {
//     public int minimumSwaps(int[] nums) {
//         int n = nums.length, swaps = 0;
//         while (true) {
//             int i = -1, j = -1;
//             for (int k = 0; k < n; k++) {          // leftmost zero
//                 if (nums[k] == 0) { i = k; break; }
//             }
//             for (int k = n - 1; k >= 0; k--) {     // rightmost non-zero
//                 if (nums[k] != 0) { j = k; break; }
//             }
//             if (i == -1 || j == -1 || i > j) break;
//             int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
//             swaps++;
//         }
//         return swaps;
//     }
// }

// class Solution {
//     public int minimumSwaps(int[] nums) {
//         int i = 0, j = nums.length - 1, swaps = 0;
//         while (i < j) {
//             if (nums[i] != 0) {
//                 i++;                 // already a non-zero on the left, fine
//             } else if (nums[j] == 0) {
//                 j--;                 // already a zero on the right, fine
//             } else {                 // nums[i] == 0 and nums[j] != 0
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//                 swaps++;
//                 i++;
//                 j--;
//             }
//         }
//         return swaps;
//     }
//}

class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length, z = 0;
        for (int x : nums) if (x == 0) z++;

        int swaps = 0;
        for (int i = 0; i < n - z; i++) {
            if (nums[i] == 0) swaps++;
        }
        return swaps;
    }
}



