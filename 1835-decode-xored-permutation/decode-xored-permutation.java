class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        
        int e = 0;
        for (int i = 1; i < n - 1; i += 2) {
            e ^= encoded[i];
        }
        
        int f = total ^ e;
        int[] perm = new int[n];
        perm[0] = f;
        
        for (int i = 1; i < n; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        
        return perm;
    }
}