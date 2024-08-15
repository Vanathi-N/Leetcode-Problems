class Solution {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        int n = s.length();
        for(int i = 0 ; i < n ; i++)
        {
            count[s.charAt(i) - 'a']++;
        }
        int max = 0, idx = 0;
        for(int i = 0 ; i < count.length ; i++)
        {
            if(max < count[i])
            {
                max = count[i];
                idx = i;
            }
        }
        if(max > (n+1)/2)
        return "";
        char[] result = new char[n];
        int index = 0;
        while(count[idx] != 0)
        {
            result[index] = (char) (idx + 'a');
            index = index + 2;
            count[idx]--;
        }
        for(int i = 0 ; i < count.length ; i++)
        {
            while(count[i] != 0)
            {
                if(index >= result.length)
                index = 1;
            
            result[index] = (char)(i + 'a');
            index = index + 2;
            count[i]--;
            }
        }
        return String.valueOf(result);

    }
}