package Utils;

import org.junit.Test;

import static Utils.Excercices.isListOrdered;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class IsListOrderedTests {

    @Test
    public void one_to_nine_ordered_test() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        assertTrue(isListOrdered(numbers, 0, numbers.size() - 1));
    }
}
