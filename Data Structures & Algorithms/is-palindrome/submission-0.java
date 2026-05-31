class Solution {
    public boolean isPalindrome(String s) {

     StringBuilder reverseStrBuilder = new StringBuilder();

     int i=0;
     for(char c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
           reverseStrBuilder.append(Character.toLowerCase(c));     
        }
     }
     return reverseStrBuilder.toString().equals(reverseStrBuilder.reverse().toString());
    }
}
