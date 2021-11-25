package Utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static Utils.Excercices.BinarySearch;
import static org.junit.Assert.assertEquals;

public class BinarySearchTests {

    @Test
    public void test_one_to_nine_list_search_5() {
        assertEquals(4, BinarySearch(Arrays.asList(1,2,3,4,5,6,7,8,9), 0, 8, 5));
    }

    @Test
    public void test_one_to_ten_list_search_5() {
        assertEquals(4, BinarySearch(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 0, 9, 5));
    }

    @Test
    public void test_one_to_eleven_list_search_6() {
        assertEquals(5, BinarySearch(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11), 0, 9, 6));
    }

    @Test
    public void test_one_to_one_list_search_1() {
        assertEquals(0, BinarySearch(List.of(1), 0, 1, 1));
    }

    @Test
    public void test_one_to_one_list_search_2() {
        assertEquals(-1, BinarySearch(List.of(1), 0, 1, 2));
    }

}
