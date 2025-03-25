class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs1=new HashSet<>();
        HashSet<Character> hs2=new HashSet<>();
        String x="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<26;i++){
            hs1.add(x.charAt(i));
        }
        int len=sentence.length();
        for(int i=0;i<len;i++){
            hs2.add(sentence.charAt(i));
        }
        if(hs1.equals(hs2)){
            return true;
        }
        else return false;
    }
}