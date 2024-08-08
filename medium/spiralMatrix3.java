public class spiralMatrix3 {
    class Solution {
        public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            List<int[]> res = new ArrayList<>();
            int r = rStart, c = cStart, steps = 1, i = 0;
    
            while (res.size() < rows * cols) {
                for (int x = 0; x < 2; x++) {
                    int dr = directions[i][0], dc = directions[i][1];
                    for (int y = 0; y < steps; y++) {
                        if (0 <= r && r < rows && 0 <= c && c < cols) {
                            res.add(new int[]{r, c});
                        }
                        r += dr;
                        c += dc;
                    }
                    i = (i + 1) % 4;
                }
                steps++;
            }
    
            int[][] resultArray = new int[res.size()][2];
            for (int j = 0; j < res.size(); j++) {
                resultArray[j] = res.get(j);
            }
    
            return resultArray;
        }
    }
}
