package neetcode.array.sliding.window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class StringPermutation {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c :  s1.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        
        int matchLength = 0, r = 0;

        while (r < s2.length()) {
            char c = s2.charAt(r);
           
            if(map.containsKey(c)) {
                if(map.get(c) == 0) {
                    matchLength = 0;
                } else if(matchLength + 1 == s1.length()) {
                    return true;
                } else {
                    matchLength = matchLength + 1;
                    map.put(c, map.get(c) - 1);
                }
            } else {
                matchLength = 0;
            }
            r++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="ab";
        String s2="lecaabee";

        StringPermutation sp = new StringPermutation();

        System.out.println(sp.checkInclusion(s1, s2));
    }
}
