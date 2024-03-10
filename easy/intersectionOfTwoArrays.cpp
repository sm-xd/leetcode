class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        int i = 0, j = 0, index = 0, key;
        vector<int> ans(max(nums1.size(), nums2.size()));
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        while (i < nums1.size() && j < nums2.size()) {
            if (nums1[i] == nums2[j]) {
                if (nums1[i] != key) {
                    key = nums1[i];
                    ans[index++] = key;
                }
                i++;
                j++;
            } else if (nums1[i] > nums2[j])
                j++;
            else
                i++;
        }
        ans.resize(index);
        return ans;
    }
};