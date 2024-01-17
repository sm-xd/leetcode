#include <vector>
class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        int countIndex = 1;
        int key = nums[0];
        for (int i = 1; i < nums.size(); i++)
        {
            if (nums[i] != key)
            {
                key = nums[i];
                nums[countIndex++] = key;
            }
        }
        return countIndex;
    }
};