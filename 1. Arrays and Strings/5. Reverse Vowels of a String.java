// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"
// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

class Solution {
    public String reverseVowels(String s) {
        String vowel="";
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'|| ch=='E'||ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowel+=ch;
            }
        }
        int size=vowel.length()-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A'|| ch=='E'||ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                result+=vowel.charAt(size--);
            }
            else
                result+=ch;
    }
    return result;
}
}
