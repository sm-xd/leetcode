class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int main = 0, n = s.length() - 1;
        bool flag = true;
        for (int i = 0; i < n; i++) {
            if (flag && s[i] == '1') {
                swap(s[i], s[n]);
                flag = false;
            }
            if (s[i] == '1')
                swap(s[i], s[main++]);
        }
        return s;
    }
};