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
        // translate to binary array: {1, 3, 4, 6, 8, 5} -> {0, 1, 1, 1, 1, 0}
        int[] binaryRoute = new int[route.length];
        for (int i = 0; i < route.length; i++) {
            binaryRoute[i] = route[i] % 2 == 0 ? 1 : 0;
        }

        int sum = 0;
        for (int i = 0; i < binaryRoute.length; i++) {
            if (binaryRoute[i] == 0)
                sum = 0;
            else
                sum += binaryRoute[i];

            if (sum >= 3) {
                return i;
            }
        }

        throw new RuntimeException("failed");
    }
}
