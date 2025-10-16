
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // signature (sorted letters) -> list of original strings
        Map<String, List<String>> buckets = new HashMap<>();

        for (String s : strs) { //processes each word one by one in the input list
            char[] arr = s.toCharArray();   // convert it into an array of characters like s = "eat" -> arr = ['e', 'a', 't'];
            Arrays.sort(arr);                 // canonical form for all anagrams of s, like "eat" -> ['a','e','t'], "tea" -> ['a','e','t'], "ate" -> ['a','e','t']
            
            String key = new String(arr);     // e.g., arr = ['a','e','t']  -> key = "aet"

            buckets.computeIfAbsent(key, k -> new ArrayList<>()).add(s); //"if the key does not exist in the map yet, create a new empty list and store it under this key"
            
            /*if "aet" does not exist, it creates a new ArrayList<>()
            then, .add(s) adds the current string s to that list
            */
        
            // manual version of computeIfAbsent
            //if (!buckets.containsKey(key)) {      // if key doesn't exist yet
            //    buckets.put(key, new ArrayList<>()); // create a new list
            //}
            
            //buckets.get(key).add(s);              // add the string to the list
            // .get(key) -> return value of key like .get("aet") -> return ["ate", "tea"], then .add("eat") -> ["ate","tea","eat"]
        }
        
        return new ArrayList<>(buckets.values()); //buckets.values() = 
        //["eat", "tea", "are"]
        //["tan", "nat"],
        //["bat"]
    }
}
