class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length ; i++)
        {   
          set.add(nums[i]); 
        }      

        //[2,20,4,10,3,4,5]

        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length ; i++)
        {   
          int n = nums[i];  
          if (set.contains(n - 1)) 
            continue;      // not a start, skip

            int length = 1;                          // new run begins at n
            while (set.contains(n + length)) 
            {
                length++;                            // extend while the next number exists
            }
            max = Math.max(max, length);             // run finished, compare once

        }      

        return max;
    }
}