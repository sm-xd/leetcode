class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int main = 0, current = 0;

        while (current < nums.size()) {
            if (nums[current] != 0) {
                swap(nums[main], nums[current]);
                main++;
            }
            current++;
        }
    }
};