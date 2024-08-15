class Solution {
    int[][][][] memo;

    public int[] findPermutation(int[] nums) {

        boolean[] visited = new boolean[nums.length];
        visited[0] = true;

        memo = new int[nums.length][nums.length][1 << nums.length][];
        solveMemo(1, nums, visited, 0, 1);

        // System.out.println(result);
        int[] result = new int[nums.length];

        result[0] = 0;
        int bit = 1;
        int prev = 0;
        int idx = 1;

        int[] cArr;
        int val;

        for (int i = 1; i < nums.length; ++i) {
            cArr = solveMemo(idx, nums, visited, prev, bit);
            val = cArr[1];
            result[i] = val;

            idx++;
            prev = val;
            bit ^= 1 << val;
        }
        return result;
    }

    // DP+MEMO
    private int[] solveMemo(int idx, int[] nums, boolean[] visited, int prev, int bit) {
        if (idx == nums.length) {
            return new int[] { Math.abs(prev - nums[0]), 0 };
        } else if (memo[idx][prev][bit] != null) {
            return memo[idx][prev][bit];
        }

        int result = 1000;
        int val = -1;

        int nextBit;

        for (int i = 1; i < nums.length; ++i) {
            if (visited[i]) {
                continue;
            }

            visited[i] = true;

            nextBit = bit ^ (1 << i);

            int test = Math.abs(prev - nums[i]) + solveMemo(idx + 1, nums, visited, i, nextBit)[0];

            if (test < result) {
                result = test;
                val = i;
            }
            visited[i] = false;
        }

        memo[idx][prev][bit] = new int[] { result, val };
        return memo[idx][prev][bit];
    }
}