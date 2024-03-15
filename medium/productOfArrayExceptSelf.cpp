class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int> ans (n);
        int temp=1,i;
        for (i = 0; i < n; i++) { 
            ans[i] = temp; 
            temp *= nums[i]; 
        } 
        temp=1;
        for (i = n - 1; i >= 0; i--) { 
            ans[i] *= temp; 
            temp *= nums[i]; 
        }
        return ans;
    }
};