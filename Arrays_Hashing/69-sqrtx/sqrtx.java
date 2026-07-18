class Solution {
    public int mySqrt(int x) {
        long mul =0;
        int num=0;
        if(x<=1) return x;
        for(int i=1;i<=x/2;i++){
            mul = (long)i*i;
            if(mul == x) return i;
            else if(mul < x && ((long)(i+1)*(i+1)>x)) return i;
            
         

        }
        
        return num;
    }
}