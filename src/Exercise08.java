import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Erik on 6/29/16.
 */
public class Exercise08 {

    public static void main(String[] args) throws FileNotFoundException {
        //parse people.csv into ArrayList<String> that contains first and last names
        // using scanner prompt user for search term
        // print out the names that contain the term

        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(new File("People.csv"));
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Type Search Term");
        String searchTerm = consoleScanner.nextLine();

//        String searchTerm = "mur";

        //solve for via loop
        for (String name: names) {
            if (name.toLowerCase().contains(searchTerm)) {
                System.out.println(name);
            }
        }
        System.out.println();

        //solve via stream
        names.stream()
                .map(name -> name.toLowerCase())
                .filter(name -> name.toLowerCase().contains(searchTerm.toLowerCase()))
//                .forEach(System.out::println);
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println();
    }

}


//    public static ArrayList<Person> people = new ArrayList<>() throws FileNotFoundException {
//        File peopleFile = new File("People.csv");
//        Scanner fileScanner = new Scanner(peopleFile);
//        fileScanner.nextLine();
//        while (fileScanner.hasNext()) {
//            String line = fileScanner.nextLine();
//            String[] columns = line.split(",");
//            Person p = new Person(columns[1], columns[2]);
//            people.add(p);
//        }
//
//        return people;

