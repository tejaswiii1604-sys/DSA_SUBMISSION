//optimal solution O(m*)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> Result = new HashMap();
       for(String s : strs){
            int[] arr = new int[26];
            for(char c  : s.toCharArray()){
                arr[c -'a']++;
            }
            String key = Arrays.toString(arr);
             if (!Result.containsKey(key)) {
                Result.put(key, new ArrayList<>());
            }
            Result.get(key).add(s);
       }
       return new ArrayList<>(Result.values());
    }
}