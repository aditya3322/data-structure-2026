package neetcode.array;

import java.util.*;

class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();

        for(String str: strs) {
            int key = getKey(str);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>(List.of(str)));
            } else {
                map.get(key).add(str);
            }

            //System.out.println("String : " + str + ", Key : " + key + ", Map : " + map);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        GroupAnagram groupAnagram = new GroupAnagram();
        System.out.println("Output: " + groupAnagram.groupAnagrams(strs));

    }

    public int getKey(String str) {
        int key = 0;

        for(char c: str.toCharArray()) {
            key += c -'0';
        }
        return key;
    }
}
