class Solution {
    public boolean isPalindrome(String str,int i,int j){
       int s=i,e=j;
       while(s<e){
        if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        s++;
        e--;
       }
       return true;
    }
    public String shortestPalindrome(String s) {
    
        int n=s.length();
        for(int i=n;i>=0;i--){
            if(isPalindrome(s,0,i-1)){
                 String str=s.substring(i);
                StringBuilder sb=new StringBuilder(str);
                return sb.reverse().toString()+s;
            }
        }
        return s;
    }
}