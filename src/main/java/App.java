import java.util.List;

import static Utils.Excercices.*;

public class App {
    public static void main(String[] args) {
        List<Integer> orangesFallLocations = List.of(2);
        List<Integer> applesFallLocations = List.of(-2);
        System.out.println(countApplesAndOranges(2,3,1,5,orangesFallLocations, applesFallLocations));
    }
}
