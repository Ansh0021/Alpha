class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int l = 0, r = s.length() - 1;
        String vow="aeiouAEIOU";
        while(l<r){
            while(l<r && vow.indexOf(word[l]) == -1){
                l++;
            }
            while(l<r && vow.indexOf(word[r]) ==-1){
                r--;
            }
            char temp=word[l];
            word[l]=word[r];
            word[r]=temp;
            
            l++;
            r--;
        }
        String ans=new String(word);
        return ans;

    }
}