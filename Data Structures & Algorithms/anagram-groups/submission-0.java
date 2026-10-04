class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String str1: strs)
        {
            char [] s = sort(str1);
            String str = new String(s);
            if(map.isEmpty())
            {
                ArrayList<String> stringList = new ArrayList<>();
                stringList.add(str1);
                map.put( str, stringList);
            }
            else
            {
                /* 
                    lookup key based on sorted string , if found , 
                    these are anagrams 
                */  
                if(map.containsKey(str))
                {
                    ArrayList<String> stringList = map.get(str);
                    stringList.add(str1);
                    map.put(str, stringList);
                }
                else
                {
                     ArrayList<String> stringList = new ArrayList<>();
                stringList.add(str1);
                map.put( str, stringList);
                }
            }
        }

        List<List<String>> lists = new ArrayList<List<String>> ();
       
        for(String str : map.keySet())
        {
            lists.add(map.get(str));
        }

        return lists;

    }

    private char[] sort(String str)
    {
          char []s = str.toCharArray();
                Arrays.sort(s);
          return s;      
    }

    // private isAnagram(String a, String b)
    // {
    //     char [] s = a.toStringArray();
    //     char [] t = b.toStringArray();

    //     Arrays.sort(s);
    //     Arrays.sort(t);

    //     return Arrays.equals(s,t);
    // }

}
