import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by Erik on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward" };

        // Arraylist<String> that contains the names with only capital letters
        // filter out names that don"t start with "A"
        //[ "ALICE", "ANDREW"]

        ArrayList<String> nameCaps = new ArrayList<>();
        for (String name : names) {
            nameCaps.add (name.toUpperCase());
        }

//        Does not work properly
//        for (String name : nameCaps) {
//            if (!name.startsWith("A")) {
//                nameCaps.remove(name);
//            }
//        }

//      Solution 1:

        for (int i = 0; i < nameCaps.size(); i++) {
            String name = nameCaps.get(i);
            if (!name.startsWith("A")) {
                nameCaps.remove(i);
                i--;
            }
        }
        System.out.println(nameCaps);

//      Solution 2: use temporary collection

        nameCaps = new ArrayList<>();
        for (String name : names) {
            nameCaps.add (name.toUpperCase());
        }
        ArrayList<String> tempNames = new ArrayList<>();
        for (String name : nameCaps) {
            if (name.startsWith("A")) {
                tempNames.add(name);
            }
        }
        System.out.println(tempNames);

//      Solution 3: use iterator

        nameCaps = new ArrayList<>();
        for (String name : names) {
            nameCaps.add (name.toUpperCase());
        }
        Iterator<String> iter = nameCaps.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(nameCaps);

//      Solution 4: use a stream

//      map: run function on every item in collection
//      filter: return only items that function is true for

        nameCaps = new ArrayList<>();
        for (String name : names) {
            nameCaps.add(name);
        }

        nameCaps = nameCaps.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(nameCaps);


    }
}
