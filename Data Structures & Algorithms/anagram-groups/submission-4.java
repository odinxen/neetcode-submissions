class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String str1: strs)
        {
            char [] s = str1.toCharArray();
            Arrays.sort(s);
            String str = new String(s);
            // map.computeIfAbsent(new String(c), k -> new ArrayList<>()).add(s);
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

        List<List<String>> lists = new ArrayList<List<String>> ();
       
        for(String str : map.keySet())
        {
            lists.add(map.get(str));
        }

        return lists;

    }
}
