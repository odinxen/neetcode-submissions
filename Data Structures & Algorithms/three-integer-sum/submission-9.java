class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> sums = new ArrayList<>();
        // sort from 2sum sorted 
        Arrays.sort(nums);    

        for(int i = 0; i < nums.length - 1; i++)
        {
            if( i != 0 && nums[i] == nums[i-1])
            {
                continue;
            }

            for(int low = i+1 , high = nums.length - 1; low < high;)
            {

                if(nums[i] + nums[low] + nums[high] > 0)
                {
                    high--;
                }
                else if(nums[i] + nums[low] + nums[high] < 0)
                {
                    low++;
                }
                else
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    sums.add(list);
                     low++;

                    while(nums[low] == nums[low-1] && low < high)
                    {
                     low++;
                    }
                }       
            }
        }
        return sums;
    }
}
