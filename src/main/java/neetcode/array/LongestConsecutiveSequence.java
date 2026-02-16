package neetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set =  new HashSet<>();
        for(int num :  nums) {
            set.add(num);
        }

        int longestConsecutiveSeq = 0;
        for(int num :  nums) {
            if(!set.contains(num - 1)) {
               int currentSeq = 1;
               int currentNum = num;
               while(set.contains(currentNum + 1)) {
                   currentSeq++;
                   currentNum = currentNum + 1;
               }
               longestConsecutiveSeq = Math.max(longestConsecutiveSeq, currentSeq);
            }
        }
        return longestConsecutiveSeq;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{ 2,20,4,10,3,4,5 };
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
    }
}
