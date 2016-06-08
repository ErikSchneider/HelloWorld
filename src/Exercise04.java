import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Erik on 6/8/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Jones", "Charlie", "Brown"};

        //{"Smith": "Alice", "Jones": "Bob", "Brown", "Charlie"}
        // HashMap<String, String>

        HashMap<String, String> namesMap = new HashMap<>();

        for (int i = 0; i < names.length; i += 2) {
            String firstName = names[i];
            String lastName = names[i + 1];
            namesMap.put(lastName, firstName);
        }
        System.out.println(namesMap);

        namesMap = new HashMap<>();
        ArrayList<String> nameArr = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> pair;
        while (nameArr.size() > 0) {
            pair = new ArrayList<>(nameArr.subList(0, 2));
            nameArr = new ArrayList<>(nameArr.subList(2, nameArr.size()));
            namesMap.put(pair.get(1),pair.get(0));
        }

        System.out.println(namesMap);
    }
}
