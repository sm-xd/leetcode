class Solution {
public:
    int climbStairs(int n) {
        if (n == 1 || n == 2)
            return n;
        int ans, one = 1, two = 2;
        for (int i = 2; i < n; i++) {
            ans = one + two;
            one = two;
            two = ans;
        }
        return ans;
    }
};