class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        
        if (Arrays.stream(nums).allMatch(x -> x == 0)) return 0;
        int left = 1, right = queries.length;
        if (!canMakeZeroArray(right, nums, queries)) return -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMakeZeroArray(mid, nums, queries)) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    private boolean canMakeZeroArray(int k, int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        for (int i = 0; i < k; i++) {
            int left = queries[i][0], right = queries[i][1], val = queries[i][2];
            diff[left] += val;
            diff[right + 1] -= val;
        }
        int currVal = 0;
        for (int i = 0; i < n; i++) {
            currVal += diff[i];
            if (currVal < nums[i]) return false;
        }
        return true;
    }
}

// class Solution {
//     public int minZeroArray(int[] nums, int[][] queries) {

//         int total=0;
//         for(int ele:nums){
//             total=total+ele;
//         }
//         if(total==0) return 0;
//         for(int i=0;i<queries.length;i++){
//             for(int k=queries[i][0];k<=queries[i][1];k++){
//                 int numsEle=nums[k];
//                 int temp=nums[k]-queries[i][2];
//                 nums[k]=temp>0?temp:0;
//                 if(nums[k]==0){
//                     total-=numsEle;
//                 }
//                 else{
//                     total=total-(numsEle-nums[k]);
//                 }
//             }
//             if(total==0) return i+1;
//         }
//         return -1;
//     }
// }