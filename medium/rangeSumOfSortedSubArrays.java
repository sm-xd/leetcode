class Solution {
    final int MOD = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> sumSubArrays = new ArrayList<>();
        int result = 0, currSum = 0;
        for(int i=0;i<n;i++){
            currSum = 0;
            for(int j=i;j<n;j++){
                currSum = (currSum + nums[j]) % MOD;
                sumSubArrays.add(currSum);
            }
        }
        Collections.sort(sumSubArrays);
        for(left--;left<right;left++){
            result =(result + sumSubArrays.get(left)) % MOD;
        }
        return result;
    }
}