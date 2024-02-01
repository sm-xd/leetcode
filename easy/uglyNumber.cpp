class Solution {
public:
    int isDivisible(int n) {
        if (n == 0)
            return 0;
        int arr[3] = {2, 3, 5};
        for (int i = 0; i < 3; i++) {
            if (n % arr[i] == 0)
                return arr[i];
        }
        return 0;
    }
    bool isUgly(int n) {
        int divisor;
        while (n != 1) {
            divisor = isdivisible(n);
            if (divisor == 0)
                return false;
            n = n / divisor;
        }
        return true;
    }
};