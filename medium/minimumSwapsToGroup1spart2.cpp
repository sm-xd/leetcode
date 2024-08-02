class Solution {
public:
    int minSwaps(vector<int>& nums) {
        int size = nums.size();
        int totalOnes=0,l=0,r;
        for(int i=0;i<size;i++)
        {
            if(nums[i]==1) totalOnes++;
        }
        int winOnes=0,maxWinOnes=0;
        for(r=0;r<2*size;r++)
        {
            if(nums[r%size]==1) winOnes++;
            
            if((r-l+1) >totalOnes)
            {
                winOnes -= nums[l%size];
                l++;
            }
            maxWinOnes = max(winOnes,maxWinOnes);
        }
        cout<<totalOnes<<endl;
        // cout<<maxWinOnes<<endl;
        return totalOnes-maxWinOnes;
    }
};