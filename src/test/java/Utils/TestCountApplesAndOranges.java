package Utils;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static Utils.Excercices.countApplesAndOranges;
import static org.junit.Assert.*;

public class TestCountApplesAndOranges {

    @Test
    public void countApplesAndOranges_HR_Test_2() {
        List<Integer> expectedtotalOrangesAndApplesOnTheHouse = Arrays.asList(1,1);
        List<Integer> orangesFallLocations = List.of(2);
        List<Integer> applesFallLocations = List.of(-2);
        assertEquals(expectedtotalOrangesAndApplesOnTheHouse, countApplesAndOranges(2,3,1,5,orangesFallLocations,applesFallLocations));
    }

}