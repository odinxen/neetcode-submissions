class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: nums)
        {
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        List<Integer> numbers = new ArrayList<>(countMap.keySet());
        numbers.sort((a,b) -> countMap.get(b) - countMap.get(a));
        
        int [] results = new int[k];

        for(int i = 0; i < k; i++)
        {
            results[i] = numbers.get(i);
        }

        return results;
    }
}
