class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        
        // Arrays.sort(nums);
        // int min=nums[0];
        // int max=nums[n-1];
        //    if(n<=1&&nums[0]==0){
        //     return 1;
        // }
        // if(n<2&&n>0){
        //     return min-1;
        // }
     
    
        
        int gsum=0; int sum=0;
        for(int i=0;i<n;i++){
            gsum+=nums[i];
            sum+=i+1;
        }
       
        //   for(int i=min;i<=max;i++){
        //     sum+=i;
        // }
        // if(gsum==sum){
        //     return max+1;
        // }
        // else{
        return sum-gsum;
      //  }
    }
}