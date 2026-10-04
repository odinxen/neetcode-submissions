class Solution {

    public String encode(List<String> strs) 
    {
      /*
      a quick brown fox @# jumped over thew lazy dog !!
      */      

      StringBuilder sb = new StringBuilder();
      for(String string: strs)
      {
        sb.append(string);
        sb.append("¶");
      }

      return sb.toString();
    }

    public List<String> decode(String str) 
    {
        List<String> decoded = new ArrayList<>();
        String [] parts = str.split("¶",-1);
            for (int i = 0; i < parts.length - 1; i++) 
            {  
                decoded.add(parts[i]);
             }


        return decoded;
    }
}
