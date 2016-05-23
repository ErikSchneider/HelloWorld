import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Erik on 5/23/16.
 */
public class Exercise01 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Andrea", "Albert", "Beth"};

        // "A": ["Alice", "Andrea", "Albert"]
        // "B": ["Bob", "Beth"]
        // "C": ["Charlie"]
        // "D": ["David"]

        HashMap<String, ArrayList<String>> nameMap = new HashMap<>();



        for (String name: names) { // ( for each name = names)
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            nameMap.put(firstLetterStr, new ArrayList<>());
        }


        // nameMap currently looks like this
        // "A": []
        // "B": []
        // "C": []
        // "D": []

        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetterStr);
            arr.add(name);


        }

        System.out.println(nameMap);

    }
}
