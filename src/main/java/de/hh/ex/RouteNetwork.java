package de.hh.ex;

/**
 * the input array represents a route network.
 * uneven number means up
 * even number means to the right
 * Find one solution which scales with O(n) to find
 * the first point of intersection of the route network
 */

public class RouteNetwork {

    /* the first point of intersection is located in the array
    *  where three positive numbers occur one after another
    */
    static int find(int[] route) {
        int sum = 0;

        for (int i = 0; i < route.length; i++) {
            sum += route[i] % 2 == 0 ? 1 : -sum;

            if (sum >= 3)
                return i;
        }

        throw new RuntimeException("failed");
    }
}
