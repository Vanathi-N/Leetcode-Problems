class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public String gcdOfStrings(String str1, String str2) {
        // StringBuilder sb=new StringBuilder();
        // int n=str1.length();
        // int m=str2.length();
        // int i=0,j=0;
        // while(i<n&&j<m){
        //     if(str1.charAt(i)==str2.charAt(j)){
        //         sb.toString();
        //         if(sb.contains(str2.charAt(j)+"")){
        //             sb.append(str2.charAt(j));
        //         }
        //         j++;
        //     }
        //     i++;
        // }
        // return sb.toString();
        int n=str1.length();
        int m=str2.length();
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int len=gcd(n,m);
        return str1.substring(0,len);
    }
}