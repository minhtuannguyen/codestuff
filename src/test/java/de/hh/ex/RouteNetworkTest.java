package de.hh.ex;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * the input array represents a route network.
 * uneven number means up
 * uneven number means to the right
 * Find one solution which scales with O(n) to find
 * the first point of intersection of the route network
 */
public class RouteNetworkTest {

    @Test
    public void interceptPointIsThe4th() throws Exception {
        //Given
        int[] route = new int[]{-1, 2, 3, 4, 5, -6};

        //When
        int result = RouteNetwork.find(route);

        assertEquals(3, result);
    }

    @Test
    public void interceptPointIsThe10() throws Exception {
        //Given
        int[] route = new int[]{-1, 2, -3, 4, -5, 6, -7, 8, 9, 10};

        //When
        int result = RouteNetwork.find(route);

        assertEquals(9, result);
    }

    @Test
    public void interceptPointIsThe11() throws Exception {
        //Given
        int[] route = new int[]{-1, 2, -3, -4, -5, 6, -7, -8, 9, 10, 11};

        //When
        int result = RouteNetwork.find(route);

        assertEquals(10, result);
    }
}