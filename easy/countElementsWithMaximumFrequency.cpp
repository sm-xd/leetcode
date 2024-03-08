class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int, int> hashmap;
        int max = 0, count = 1, n = nums.size();
        for (int i = 0; i < n; i++) {
            if (hashmap.find(nums[i]) != hashmap.end()) {
                hashmap[nums[i]]++;
            } else {
                hashmap.insert({nums[i], 1});
            }
        }
        for (auto i = hashmap.begin(); i != hashmap.end(); i++) {
            int value = i->second;
            if (value == max && max != 0)
                count++;
            if (value > max) {
                max = value;
                count = 1;
            }
        }
        return max * count;
    }
};