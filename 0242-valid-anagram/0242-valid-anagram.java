import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count occurrences in s
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (map.containsKey(c1)) {
                int freq = map.get(c1);
                map.put(c1, freq + 1);
            } else {
                map.put(c1, 1);
            }
        }

        // Count occurrences in t
        for (int i = 0; i < t.length(); i++) {
            char c2 = t.charAt(i);
            if (map2.containsKey(c2)) {
                int freq = map2.get(c2);
                map2.put(c2, freq + 1);
            } else {
                map2.put(c2, 1);
            }
        }

        // Compare frequency counts
        for (Character key : map.keySet()) {
            if (!map2.containsKey(key) || !map.get(key).equals(map2.get(key))) {
                return false;
            }
        }

        return true;
    }
}
