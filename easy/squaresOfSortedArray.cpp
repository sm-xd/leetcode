class Solution {
public:
    int square(int n) { return n * n; }
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n);
        int left = 0, right = n - 1, i = n - 1;
        while (i >= 0) {
            if (square(nums[left]) > square(nums[right]))
                ans[i--] = square(nums[left++]);

            else
                ans[i--] = square(nums[right--]);
        }
        return ans;
    }
};

//here we will fill the array in descending order
//here time and space complexity will be of n
