class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int [] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(map.get(target - nums[i]) != null)
            {
               result [1] = i;
               result [0] = map.get(target - nums[i]);     
               break;
            }
            else
            {   
                map.put(nums[i], i);
            }
        }
        
        return result;
    }
}
