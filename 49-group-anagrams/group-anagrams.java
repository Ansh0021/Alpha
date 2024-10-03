class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String x:strs){
            char[] ch=x.toCharArray();
            Arrays.sort(ch);
            String stch=new String(ch);
            // hm.putIfAbsent(stx,new ArrayList<>());
            if(!hm.containsKey(stch)){
                hm.put(stch,new ArrayList<>());
            }
            hm.get(stch).add(x);
        }    
        return new ArrayList<>(hm.values());
    }
}