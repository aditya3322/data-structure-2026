package neetcode.array.stack;

import java.util.Arrays;
import java.util.Stack;

class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {

        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        // Sort by position descending
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> fleets = new Stack<>();

        for (int i = 0; i < position.length; i++) {
            double timeToTarget = (double) (target - cars[i][0]) / cars[i][1];
            if (fleets.isEmpty() || fleets.peek() < timeToTarget) {
                fleets.push(timeToTarget);
            }
        }
        return fleets.size();
    }

    public static void main(String[] args) {
        int target = 10;
        int[] position = {4,1,0,7};
        int[] speed = {2,2,1,1};

        CarFleet carFleet = new CarFleet();
        System.out.println(carFleet.carFleet(target, position, speed));
    }
}
