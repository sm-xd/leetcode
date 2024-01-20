class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int start = 0, end = nums.size() - 1, mid;
        int second;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                second = mid;
                while (mid > -1 && nums[mid] == target) {
                    mid--;
                }
                while (second < nums.size() && nums[second] == target) {
                    second++;
                }
                return {(mid + 1), (second - 1)};
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return {-1, -1};
    }
};