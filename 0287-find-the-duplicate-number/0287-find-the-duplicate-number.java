class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean arr[]=new boolean[n];
        for(int num:nums){
            if(arr[num]){
                return num;
            }
                arr[num]=true;
            
        }
        return 0;
    }
}