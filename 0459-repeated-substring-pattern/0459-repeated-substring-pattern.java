class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        if(s.length()<2){
            return false;
        }
        return str.substring(1,str.length()-1).contains(s);
    }
}