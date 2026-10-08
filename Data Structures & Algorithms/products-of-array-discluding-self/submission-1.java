class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int len = nums.length;
        int [] out = new int[len];
        int [] right = new int[len];
        int [] left = new int[len];
        
        left[0] = 1;   
        right[len-1] = 1;     

        //left product
        for(int i = 1; i < len; i++)
        {
            left[i] = nums[i-1] * left[i-1];
        }

  
        //right product
        for(int i = len - 2; i >= 0; i--)
        {
            right[i] = nums[i+1] * right[i+1];
        }

        //final product
        for(int i = 0; i < len; i++ )
        {
            out[i] = left[i] * right[i];    
        }    

        return out;

    }
}  
