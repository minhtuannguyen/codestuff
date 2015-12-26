package de.hh.ex;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * the input array represents a route network.
 * uneven number means up
 * even number means to the right
 * Find one solution which scales with O(n) to find
 * the first point of intersection of the route network
 */
public class RouteNetworkTest {

    @Test
    public void interceptPointIsThe4th() throws Exception {
        //Given
        int[] route = new int[]{1, 3, 4, 6, 8, 5};

        //When
        int position = RouteNetwork.find(route);

        //Then
        assertEquals(position, 4);
    }

    @Test
    public void interceptPointIsThe10() throws Exception {
        //Given
        int[] route = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10, 12};

        //When
        int position = RouteNetwork.find(route);

        //Then
        assertEquals(position, 9);
    }

    @Test
    public void interceptPointIsThe11() throws Exception {
        //Given
        int[] route = new int[]{-1, 2, -3, -5, -7, 6, -9, -11, 20, 40, -60, 20};

        //When
        int position = RouteNetwork.find(route);

        //Then
        assertEquals(position, 10);
    }

    @Test
    public void interceptPointIsThe3Position() throws Exception {
        //Given
        int[] route = new int[]{1, 2, 4, 6, 8, 10, 12};

        //When
        int position = RouteNetwork.find(route);

        //Then
        assertEquals(position, 3);
    }
}