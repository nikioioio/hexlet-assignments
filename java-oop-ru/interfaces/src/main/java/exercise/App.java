package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App{
    public static List<String> buildApartmentsList(List<Home> apartaments, int firstEl){
        apartaments.sort(new Comparator<Home>() {
            @Override
            public int compare(Home o1, Home o2) {
                return (int) (o1.getArea() - o2.getArea());
            }
        });
        List<String> strings = new ArrayList<>();
        if (apartaments.size() > 0){
            for (int i = 0; i < firstEl; i++)
                strings.add(apartaments.get(i).toString());
        }
        return strings;
    }
}
// END
