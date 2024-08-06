public class minPushesForWord {
    class Solution {
        public int minimumPushes(String word) {
            int size=word.length();
            int[] freq = new int[26];
            int[] mapping = {1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,4,4};
            for(int i=0;i<size;i++){
                freq[word.charAt(i)-'a'] +=1;
            }
            Arrays.sort(freq);
            int sum =  IntStream.range(0, freq.length)
                               .map(i -> freq[i] * mapping[mapping.length - 1 - i])
                               .sum();
            return sum;
            
        }
    }
}
