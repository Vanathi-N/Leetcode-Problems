class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls=0,rs=0;
        for(int n:nums){rs+=n;}
        for(int i=0;i<nums.length;i++){
            ls+=nums[i];
            rs-=nums[i];
            nums[i]=Math.abs((ls-nums[i])-rs);
        }
        return nums;
    }
}