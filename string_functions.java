import java.util.*;
public class string_functions
{

    public static boolean compareString(String str1, String str2)
    {
        return str1.equals(str2);
    }
    public static String copyString(String original)
    {
        return new String(original);
    }
    public static String concatenateString(String str1, String str2)
    {
        return str1 + str2;
    }
    public static int compare_String(String str1, String str2)
    {
        return str1.compareTo(str2);
    }

    public static void main(String[] args)
    {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.print("***********STRING COMPARISON*********** ");
        System.out.print("\n ARE THE STRINGS EQUAL? :" + compareString(str1, str2));
        System.out.print("\n ***********INT COMPARISON*********** ");
        System.out.print("\n ARE THE STRINGS EQUAL? :" + compare_String(str1, str2));
        System.out.print("\n ***********STRING COPY***********: ");
        String copied = copyString(str1); // Copying the string
        System.out.print("\n ORIGINAL STRING: " + str1);
        System.out.print("\n COPIED STRING: " + copied);
        String part1 = "Hello";
        String part2 = "world";
        String concatenated = concatenateString(part1, part2); // Concatenating the strings
        System.out.println("\n ***********STRING CONCATENATION***********: ");
        System.out.print("CONCATENATED STRING: " + concatenated);
    }
}
