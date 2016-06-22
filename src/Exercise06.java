import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Erik on 6/22/16.
 */
public class Exercise06 {

//    static IntStream revRange(int from, int to) {
//        return IntStream.range(from, to)
//                .map(i -> to - i + from - 1);
//    }

    public static void main(String[] args) {
        int number = 12345;

//        List<Integer> list = Arrays.asList(number);
//        Comparator<Integer> comparator = Integer::compare;
//        list.stream().sorted(comparator.reversed()).forEach(System.out::println);

        solveViaLoop(number);
        solveViaStringBuilder(number);
        solveViaMath(number);

    }

    public static void solveViaLoop (int number) {
        char[] chars = String.valueOf(number).toCharArray();
        char[] reverseChars = new char[chars.length];

        int n = chars.length -1;
        for (char c : chars) {
            reverseChars[n] = c;
            n--;
        }
        System.out.println(reverseChars);
    }

    public static void solveViaStringBuilder(int number) {
        StringBuilder s = new StringBuilder(String.valueOf(number));
        int reverseNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reverseNum);
    }

    public static void solveViaMath(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + number % 10;
            number = number / 10;
        }

        System.out.println(reverseNumber);
    }

}
