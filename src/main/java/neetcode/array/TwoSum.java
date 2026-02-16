package neetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Num[] numbers = new Num[nums.length];
        for(int i = 0; i < nums.length; i++) {
            numbers[i] = new Num(i, nums[i]);
        }
        Arrays.sort(numbers, Comparator.comparingInt(Num::getValue));

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int sum = numbers[start].getValue() + numbers[end].getValue();

            if(sum == target) {
                return new int[] {numbers[start].getIndex(), numbers[end].getIndex()};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[]  nums = {3, 2, 3};
        int target = 6;

        TwoSum twoSum =  new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}

class Num {
    int index;
    int value;

    public Num(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }
}
