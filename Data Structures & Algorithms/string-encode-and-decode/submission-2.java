class Solution 
{

    public String encode(List<String> strs) 
    {
      StringBuilder sb = new StringBuilder();
      for(String string: strs)
      {
        sb.append(string.length()+"#"+string);
      }

      return sb.toString();
    }

    public List<String> decode(String str) 
    {
         List<String> decoded = new ArrayList<>();
        //3#qwe5#qwqw10#
        for(int i = 0; i < str.length(); )
        {
            // int len = Character.getNumericValue(str.charAt(i));
            // System.out.println();

        int j = i;
        while (str.charAt(j) != '#') j++;               
        // j lands on the '#'
        int len = Integer.parseInt(str.substring(i, j));

            String str1 = str.substring(j+1, j+1+len);
            decoded.add(str1);
            i = j + len +1 ;
        }

        return decoded;
    }
}
