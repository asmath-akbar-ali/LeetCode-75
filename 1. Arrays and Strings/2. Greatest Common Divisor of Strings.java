// Example 1:
// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"

// Example 2:
// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"

// Example 3:
// Input: str1 = "LEET", str2 = "CODE"
// Output: ""

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int s1=str1.length(), s2=str2.length();
        if((str1+str2).equals(str2+str1)){
            String str=str1.substring(0, gcd(s1,s2));
            return str;
        }
        return "";
    }

    public static int gcd(int s1,int s2){
        if(s2==0)
            return s1;
        else
            return gcd(s2,s1%s2);
    }
}
