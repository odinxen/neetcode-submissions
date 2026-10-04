class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        //hold counts
        Map<Integer,Integer> countMap = new HashMap<>();
        
        //initialize counts
        //key : number
        //value: count 
        for(int num: nums)
        {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        //get top k elements 
        List<Integer> keys = new ArrayList<>(countMap.keySet());
        keys.sort((a, b) -> countMap.get(b) - countMap.get(a));        

        int [] result = new int[k];
        int i = 0;
        while(k > 0)
        {
            result[i++] = (keys.get(k-1));
            k--;
        }    

        return result;
    }
}