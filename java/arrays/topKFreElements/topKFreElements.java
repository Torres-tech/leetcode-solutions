class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        //create hashtable contains nums -> frequences
        for (int num : nums) {
            count.put(num, count.getOrDefault(num,0) +1); 
            // short syntax for this following code:
            // int newCount = count.getOrDefault(num, 0) + 1; this means if count can not get the value because this is first time to see it, then claims it to 0, +1 because we count it as the first counted value as 1 not 0
            // count.put(num, newCount);
        //try to remmeber that the count in HashMap just stores the pair value base on input nums array, it is not ordered yet so that's why we need PriorityQueue 
        } 
          //We want the top k most frequent elements, but the map gives us all frequencies without order. So now we need a way to compare frequencies efficiently.

        // We create a PriorityQueue to take these (key, value) pairs from HashMap and insert it into a heap, one by one
        //this function for building a min-heap and compare those entries by their frequency as getValue()
           PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
            //Map.Entry::getValue this is shorthand for entry -> entry.getValue()
            /*
            "When you compare two map entries, use their getValue() method (the frequency) to decide order"
            */
            //Comparator.comparingInt() means "compares two Map.Entry objects by their integer value (frequency)"


        // Step 3: Add entries to heap (building the heap from the map entries  )
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            //count.entrySet() means creating a Set of Map.Entry objects, each Map.Entry represents one pair from your map -> [(1,3), (2,2), (3,1)]
            heap.offer(entry); // insert the 'entry' includes (number, frequency) pairs into the heap (PriorityQueue) above
            if (heap.size() > k) {
                heap.poll();    // remove the smallest frequency if heap too large
            }
        }

        // Step 4: Extract the k elements from heap
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll().getKey();
        }



    return result;
    } 
}