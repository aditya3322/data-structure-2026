package neetcode.array.sliding.window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.SystemColor.window;

class MaximumInSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int maxi = nums[i];
            for (int j = i; j < i + k; j++) {
                maxi = Math.max(maxi, nums[j]);
            }
            output[i] = maxi;
        }
        return output;
    }


    public static void main(String[] args) {
        int[] arr = {1, -1};
        int k = 1;

        MaximumInSlidingWindow maximumInSlidingWindow = new MaximumInSlidingWindow();
        System.out.println(Arrays.toString(maximumInSlidingWindow.maxSlidingWindow(arr, k)));
    }
}
