class Solution {
    public int reverse(int x) {
        long temp = 0;
        while(x!=0){
            int last = x % 10;
            temp = temp + last;
            temp = temp * 10;
            x = x / 10;
        }
        temp = temp /10;
        if(temp>Integer.MAX_VALUE || temp < Integer.MIN_VALUE) return 0;
        if(x<0) return (int)(-1*temp);
        return (int)temp;
    }
}