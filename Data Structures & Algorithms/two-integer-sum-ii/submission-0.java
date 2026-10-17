class Solution 
{
    public int[] twoSum(int[] num, int target) 
    {
      int [] index = new int[2];
      for(int i = 0, j = num.length-1 ; i < j;)
      {
        if(num[i] + num[j] > target)
        {
          j--;
        }
        else if(num[i] + num[j] < target)
        {
          i++;
        }
        else
        {
          index[0] = i+1;
          index[1] = j+1;
          break;
        }
      }              
      return index;
    }
}
