class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, copy = x;
        while(x > 0){
            int temp = x % 10;
            rev = rev * 10 + temp;
            x = x / 10;
        }
        
        if(rev == copy) return true;

        return false;
        
    }
}