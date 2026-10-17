class Solution {
    public void rotate(int[] nums, int k) 
    {   
        int temp = 0;
        int [] n1 = new int[nums.length];
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < len; i++)
        {
            //next index ; 
            /*
             new_index = i+ k 
            */
            int n = (i + k );
            if(n > len - 1)
            {
                n = n % len;
            }
            n1[n] = nums[i];
        }

        for(int i = 0 ; i < len; i++)
        {
            nums[i] = n1[i];
        }   

    }
}