class Solution {
    public int compare(String a,String b){
        String s1=a+b;
        String s2=b+a;
        return s2.compareTo(s1);
    }
    public String largestNumber(int[] nums) {
        String str[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
           // str[i] = String.valueOf(nums[i]);
            str[i]=nums[i]+"";
        }
       
      for(int i=0;i<str.length;i++){
      for(int j=i+1;j<str.length;j++){
        String s1=str[i]+str[j];
        String s2=str[j]+str[i];
        if(s1.compareTo(s2)<0){
            String temp=str[j];
            str[j]=str[i];
            str[i]=temp;
        }
      }
      }
       if(str[0].equals("0")){
            return "0";
        }
      StringBuilder sb=new StringBuilder();
      for(String s:str){
        sb.append(s);
      }
      return sb.toString();
    }
}