import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Erik on 5/18/16.
 */
public class HelloWord { //class
    public static void main(String[] args) { //main method
        ArrayList<String> names = new ArrayList(); //  Generics add <String> in front of ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String name = (String) names.get(0); // example of casting add (String)in front of name

        HashMap<String, Integer> scores = new HashMap(); // Generics
        scores.put("Alice", 10);
        scores.put("Bob", 7);
        scores.put("Charlie", 3);

        int score = scores.get("Bob");
    }
}
