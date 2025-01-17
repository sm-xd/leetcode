public class NeighboringBitwiseXOR {
    public boolean doesValidArrayExist(int[] derived) {
        int res = 0;
        for (int element : derived) {
            res ^= element;
        }
        if (res == 0)
            return true;
        return false;
    }
}
