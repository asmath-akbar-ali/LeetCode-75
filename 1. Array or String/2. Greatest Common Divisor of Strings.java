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
