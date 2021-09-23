import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpression {
    public static void main(String[] args) {

       try {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the String: ");
           String string = input.nextLine();
           Pattern pattern = Pattern.compile("[A-Z].*[.]");
           Matcher matcher = pattern.matcher(string);
           boolean result = matcher.matches();
           if (result) {
               System.out.println("Input String matches with Regular Expression: " + input);
           } else {
               System.out.println("Input String doesn't matches the Regular Expression: " + input);
           }
       }
       catch (PatternSyntaxException ex)
       {
           ex.printStackTrace();
       }
    }
}
