package neetcode.array.stack;

import java.util.Arrays;
import java.util.Stack;

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<Integer[]> temperatuesStack = new Stack<>();

        int i = 0;
        while (i < temperatures.length) {
            if(temperatuesStack.isEmpty() || temperatuesStack.peek()[0] > temperatures[i]) {
                temperatuesStack.push(new Integer[]{temperatures[i], i});
            } else {
                while (!temperatuesStack.isEmpty() && temperatuesStack.peek()[0] < temperatures[i]) {
                    Integer[] temperature = temperatuesStack.pop();
                    result[temperature[1]] = i - temperature[1];
                }
                temperatuesStack.push(new Integer[]{temperatures[i], i});
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {22, 21, 20};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(input)));
    }
}
