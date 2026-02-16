package neetcode.array;

import java.security.Principal;
import java.util.*;

class TopKFreqElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Num> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, new Num(num, 0)).incrementedFreqNum());
        }
        PriorityQueue<Num> priorityQueue = new PriorityQueue<>(Comparator.comparingInt((Num n)-> n.freq).reversed());
        priorityQueue.addAll(freqMap.values());
        int[] output = new int[k];
        int count = 0;
        while (count < k) {
            Num num = priorityQueue.peek();
            if(num != null) {
                output[count] = priorityQueue.poll().value;
            }
            count++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        TopKFreqElements topKFreqElements = new TopKFreqElements();
        System.out.println(Arrays.toString(topKFreqElements.topKFrequent(nums, 2)));
    }
    class Num {
        public int value;
        public int freq;

        public Num(int value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        public Num incrementedFreqNum() {
            return new Num(this.value, this.freq + 1);
        }

        @Override
        public String toString() {
            return "{ " + value + ", " + freq + " }";
        }
    }
}


