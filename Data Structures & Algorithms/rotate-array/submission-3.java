class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        // [1000,2,4,-3], k = 2

        int len = k % nums.length;

        rev(nums, 0 , nums.length-1);
        rev(nums, 0 , len-1);
        rev(nums, len , nums.length-1);
        

    }

    public void rev(int[] num, int start, int end)
    {
        while(start < end)
        {
            int tmp = num[end];
            num[end] = num[start];
            num[start] = tmp;
            start++;
            end-- ;
        }
    }
}