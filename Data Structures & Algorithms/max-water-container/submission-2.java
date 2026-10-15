class Solution 
{

     public int maxArea(int[] height) 
     {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) 
        {
            maxArea = Math.max(maxArea, 
            Math.min(height[left], height[right])
                    * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
    	return maxArea;
    }

    public int maxArea1(int[] h) 
    {
        int min = 0, max = 0, area = 0;
        int len = h.length - 1;

        for(int i = 0; i < len ; i++)
        {
            int j = i + 1;
            while(j <= len)
            {
                int width = j - i;
                int height = Math.min(h[i],h[j]);
                area = width * height;
                if(area > max)
                  max = area; 
                j++;
            }
        }
        return max;
    }
}