// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // // brute force
//         // for (int i = 0; i < nums.length; i++) {
//         //     for (int j = i + 1; j < nums.length; j++) {
//         //         if (nums[i] + nums[j] == target) {
//         //             return new int[]{i, j};
//         //         }
//         //     }
//         // }
//         // return new int[]{};

        
//     }
// }


// class Pair {
//     int value, index;
//     Pair(int value, int index) {
//         this.value = value;
//         this.index = index;
//     }
// }

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         Pair[] arr = new Pair[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = new Pair(nums[i], i);
//         }

//         Arrays.sort(arr, (a, b) -> Integer.compare(a.value, b.value));

//         int left = 0, right = n - 1;
//         while (left < right) {
//             int sum = arr[left].value + arr[right].value;
//             if (sum == target) {
//                 return new int[]{arr[left].index, arr[right].index};
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return new int[]{};
//     }
// }


import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];

            if (seen.containsKey(find)) {
                return new int[]{seen.get(find), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}