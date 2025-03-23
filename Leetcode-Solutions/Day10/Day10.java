class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character ,Integer>mp=new HashMap<>();

        if(word1.length()!=word2.length()) return false;
        for(int i=0;i<word1.length();i++){
           char c=word1.charAt(i);
            mp.put(c,mp.getOrDefault(c ,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            mp.put(ch,mp.getOrDefault(ch ,0)-1);
        }
        for(int i:mp.values()){
            if(Math.abs(i)>3){
                return false;
            }
           
        }
        return true;

    }
}