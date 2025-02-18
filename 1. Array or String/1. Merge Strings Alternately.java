class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length();
        int w2=word2.length();
        int length=0;
        if(w1>w2)
            length=w1;
        else 
            length=w2;
        String str="";
        for(int i=0;i<length;i++){
            if(i<word1.length()){
                str+=word1.charAt(i);
            }
            if(i<word2.length()){
                str+=word2.charAt(i);
            }
        } 
        return str;
    }
}
