// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Example 2:
// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.

// Example 3:
// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        List<String> list=new ArrayList<>();
        
        String temp="";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                temp+=s.charAt(i);
            else{
                if(!temp.trim().isEmpty()){ 
                    list.add(temp);
                    temp="";
                }
            }
        }
        if(!temp.isEmpty())
                list.add(temp);

        System.out.println(list);

        int space=list.size()-1;
        int num=0;
        String a="";
        for(int i=list.size()-1;i>=0;i--){
            a+=list.get(i)+" ";
        }
    return a.trim();
    }
}
