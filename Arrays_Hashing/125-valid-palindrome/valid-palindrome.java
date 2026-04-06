class Solution {
    public boolean isPalindrome(String s) {
        String  cleaned = cleanedStr(s);
        return checkPalindrome(cleaned, 0 ,cleaned.length()-1);
        
    }
    private String cleanedStr(String s){
        StringBuilder sb= new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
    private boolean  checkPalindrome(String s, int left,int right){
        if(left >= right) return true;
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
         return checkPalindrome(s,left+1,right-1);
    }
}