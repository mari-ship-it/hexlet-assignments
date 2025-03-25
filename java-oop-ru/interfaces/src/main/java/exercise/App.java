package exercise;

import java.util.ArrayList;
import java.util.List;


// BEGIN
public class App {
    static ArrayList<String> buildApartmentsList(List<Home> apartments, int n) {

        if (n == 0 || n > apartments.size()) {
            return new ArrayList<>();
        }

        apartments.sort((home1, home2) -> {
            return Double.compare(home1.getArea(), home2.getArea());
        });
        ArrayList<String> result = new ArrayList<>();

        int i = 0;
        while (i < n) {
            var item = apartments.get(i);
            result.add(item.toString());
            i++;
        }
        return result;
    }
}
// END
