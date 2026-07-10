class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=nums[i];
        }
        int res = Math.abs(sum1-sum);
        if(res==0) return 0;
        else return res;
    }
}