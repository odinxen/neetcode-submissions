class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int [] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        Map<Integer, Integer> valMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            
            if(valMap.containsKey(target-nums[i]))
            {
                result[1] = i;
                result[0] = valMap.get(target-nums[i]);
                break;
            }
            else
            {
                valMap.put(nums[i],i);
            }
        }

        return result;
    }
}
