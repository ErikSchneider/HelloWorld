import jdk.nashorn.internal.ir.WhileNode;

/**
 * Created by Erik on 6/28/16.
 */
public class Exercise07 {
    public static void main(String[] args) {
        String s = "racecar";

        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("dad"));


        //date range: 01/01/2016 to 12/31/2016
        // MDDYY 61016 06/10/2016





    }

    public static boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());

    }
}
