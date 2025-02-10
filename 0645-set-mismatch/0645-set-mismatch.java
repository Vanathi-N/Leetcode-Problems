class Solution {
    public int[] findErrorNums(int[] nums) {
         int n=nums.length;
        boolean arr[]=new boolean[n+1];
       // int arr[]=new int[n];
       int duplicate=-1, missing=-1;
        for(int num:nums){
            if(arr[num]){
                duplicate=num;
            }
                arr[num]=true;
            
        }
        for(int i=1;i<=n;i++){
            if(!arr[i]){
                missing=i;
            }
        }
        return new int[]{duplicate,missing};
    }
}