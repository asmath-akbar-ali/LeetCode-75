// Example 1:
// Input: s = "abc", t = "ahbgdc"
// Output: true
  
// Example 2:
// Input: s = "axc", t = "ahbgdc"
// Output: false

class Solution {
    public boolean isSubsequence(String s, String t) {
        char first=0;
        char second=0;
        int count=0;
        for(int i=0;i<t.length() && first<s.length();i++){
            if(s.charAt(first)==t.charAt(second)){
                count++;
                first++;
                second++;
            }
            else{
                second++;
            }
        }
        if(count==s.length())
            return true;
        return false;
    }
}
