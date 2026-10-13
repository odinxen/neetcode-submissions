class Solution 
{

public List<List<Integer>> threeSum(int[] nums)
{
    Arrays.sort(nums);
    List<List<Integer>> results = new ArrayList<>();
    int len = nums.length;

    for(int i = 0 ; i < len-1; i++)
    {
        if( i > 0 && nums[i-1] == nums[i])
        {
            continue;
        }

        twoSum(results,nums, i, -nums[i], i+1, len-1);
    }

    return results;

}


public List<List<Integer>> twoSum(List<List<Integer>> results,
                            int[] nums, int first,int target, 
                            int start, int end) 
{
 
    int len = nums.length - 1;
    int low = start;
    int high = end;

    while(low < high)
    {

        if(nums[low] + nums[high] > target)
        {
            high--;
        }
        else if(nums[low] + nums[high] < target)
        {
            low++;
        }
        else
        {
               List<Integer> result = new ArrayList<>();
            //found it
            result.add(nums[first]);
            result.add(nums[high--]);
            result.add(nums[low++]);
            results.add(result);

                while (low < high && nums[low] == nums[low - 1])
                {
                    low++;
                }
        }
    }
    return results;
}

public List<List<Integer>> threeSum1(int[] nums)
{
    Arrays.sort(nums);
    List<List<Integer>> results = new ArrayList<>();
    int len = nums.length;

    for (int i = 0; i < len - 2; i++)
    {
        // nothing to the right can bring the sum down to 0
        if (nums[i] > 0)
        {
            break;
        }

        // fix only the first copy of each value
        if (i > 0 && nums[i] == nums[i - 1])
        {
            continue;
        }

        int lo = i + 1;
        int hi = len - 1;

        while (lo < hi)
        {
            int sum = nums[i] + nums[lo] + nums[hi];

            if (sum < 0)
            {
                // smallest is too small to work with anything
                lo++;
            }
            else if (sum > 0)
            {
                // largest is too big to work with anything
                hi--;
            }
            else
            {
                results.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                lo++;
                hi--;

                // skip repeats of the value just used
                while (lo < hi && nums[lo] == nums[lo - 1])
                {
                    lo++;
                }
            }
        }
    }

    return results;
}

}
