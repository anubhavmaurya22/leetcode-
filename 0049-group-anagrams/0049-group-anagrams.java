class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> m=new HashMap<>();
        for (String s: strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String p=new String(arr);
            if(!m.containsKey(p))
            {
                m.put(p,new ArrayList<>());
            }
            m.get(p).add(s);
        }
        return new ArrayList<>(m.values());
        
    }
}