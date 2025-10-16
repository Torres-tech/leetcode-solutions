# Group Anagrams 

# Problem

Given an array of strings, group all the anagrams together.
An anagram is a word or phrase formed by rearranging the letters of a different word, using all the original letters exactly once.

For example:

"eat", "tea", and "ate" are anagrams because they all contain the same letters: a, e, t.

"tan" and "nat" are another group.

"bat" has no anagrams, so it’s alone.


# Solution Description 
1. For each word, sort its letters alphabetically.
    Example: "eat" → "aet", "tea" → "aet", "ate" → "aet".
    
2. Words that share the same sorted version belong to the same anagram group.

3. Use a HashMap (Map<String, List<String>>) where:

    The key = the sorted word (the signature)

    The value = the list of words that match that signature

4. Add each word to the appropriate list in the map.

5. At the end, return all lists of grouped anagrams.

# Complexity Analyzist 

    Time: O(N × M log M) — for N words of average length M (because we sort each word)
    Space: O(N × M) — to store all words in the HashMap
