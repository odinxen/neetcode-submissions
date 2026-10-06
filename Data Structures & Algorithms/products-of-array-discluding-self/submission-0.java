class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int len = nums.length;
        int [] out = new int[len];
        int [] right = new int[len];
        int [] left = new int[len];
        
        //left product
        for(int i = 0; i < len; i++)
        {
            if(i == 0)
            {
             left[i] = 1;                
            }
            else
            {
             left[i] = nums[i-1] * left[i-1];
            }
        }

  
        //right product
        for(int i = len - 1; i >= 0; i--)
        {
            if(i == len -1)
            {
             right[i] = 1;                
            }
            else
            {
             right[i] = nums[i+1] * right[i+1];
            }
        }

        //final product
        for(int i = 0; i < len; i++ )
        {
            out[i] = left[i] * right[i];    
        }    

        return out;

    }
}  
