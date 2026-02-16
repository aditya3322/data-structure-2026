package neetcode.array.sliding.window;

import java.util.HashMap;
import java.util.Map;

class MinWIndow {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            count1.put(t.charAt(i), count1.getOrDefault(t.charAt(i), 0) + 1);
        }

        int have = 0, needs = t.length();
        int[] res = {-1, -1};
        int MAX_RESULT_LEN = Integer.MAX_VALUE;
        int l = 0;

        for(int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if(count1.containsKey(c) && window.get(c).equals(count1.get(c))) {
                have++;
            }

            while (have == needs) {
                if ((r - l + 1) < MAX_RESULT_LEN) {
                    MAX_RESULT_LEN = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.getOrDefault(leftChar, 0) - 1);
                if(count1.containsKey(leftChar) && window.get(leftChar) < count1.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return MAX_RESULT_LEN == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }

    public static void main(String[] args) {
        String s1 = "OUZODYXAZV";
        String s2 = "XYZ";

        MinWIndow minWIndow = new MinWIndow();
        System.out.println(minWIndow.minWindow(s1, s2));
    }
}
