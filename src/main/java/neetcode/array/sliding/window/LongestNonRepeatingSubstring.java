package neetcode.array.sliding.window;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int currLength = 0;
        Set<Character> nonRepeatingCharacters = new HashSet<>();
        int l = 0, r = 0;

        while(r < s.length()) {
            char c = s.charAt(r);

            if(!nonRepeatingCharacters.contains(c)) {
                nonRepeatingCharacters.add(c);
            } else {
                maxLength = Math.max(nonRepeatingCharacters.size(), maxLength);
                nonRepeatingCharacters.remove(s.charAt(l));
                l++;
            }
            r++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "xxxx";
        LongestNonRepeatingSubstring longestNonRepeatingSubstring = new LongestNonRepeatingSubstring();
        System.out.println(longestNonRepeatingSubstring.lengthOfLongestSubstring(s));
    }
}
