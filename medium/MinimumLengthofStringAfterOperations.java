import java.util.HashMap;

public class MinimumLengthofStringAfterOperations {
    public static int minimumLength(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }

        int sum = 0;
        for (int count : freq) {
            if (count > 0) {
                sum += (count % 2 == 0) ? 2 : 1;
            }
        }
        return sum;

        // HashMap<Character, Integer> hashMap = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        // System.err.println(i);
        // if (hashMap.containsKey(s.charAt(i))) {
        // hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
        // }
        // else{
        // hashMap.put(s.charAt(i), 1);
        // }
        // }
        // hashMap.forEach((key, value) -> System.out.println(key + ": " + value));
        // int sum = hashMap.values().stream().mapToInt(num -> (num % 2 == 0) ? 2 :
        // 1).sum();
        // return sum;
    }

    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb"));
    }
}
