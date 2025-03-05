class Solution {
    public long coloredCells(int n) {
        // AT 1 =1
        // at 2 1 +4
        // at 3 1 +4 +4+4
        // at 4 1 +4 +4+4 +4+4+4
        // at 5 1 +4 +4+4 +4+4+4 +4+4+4+4

        // lol, getting an error coz of datatype was not using long

        long ans = 1;
        for (int i = 1; i < n; i++) {
            ans += (4 * i);
        }
        return ans;
    }
}