package assin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherDemo {
   private static String REGEX = "\\d";
   private static String INPUT = "aabfooaabfooabfoob12";
   
   public static void main(String[] args) {
      Pattern pattern = Pattern.compile(REGEX);
      
      // get a matcher object
      Matcher matcher = pattern.matcher(INPUT);
      
      System.out.println(Pattern.matches("\\d", INPUT));
      if(matcher.find()) {
         //Prints the number of capturing groups in this matcher's pattern.
         System.out.println("Group Count: "+matcher.groupCount());    
      }      
   }
}