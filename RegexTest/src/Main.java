import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] argv) throws Exception {

        CharSequence inputStr = "abbabcd";
        String patternStr = "(a(b*))+(c*)";

        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(inputStr);
        boolean matchFound = matcher.find();

        if (matchFound) {
            // Get all groups for this match
            for (int i = 0; i <= matcher.groupCount(); i++) {
                // Get the group's captured text
                String groupStr = matcher.group(i);

                // Get the group's indices
                int groupStart = matcher.start(i);
                System.out.println(groupStart);
                int groupEnd = matcher.end(i);

                // groupStr is equivalent to
                inputStr.subSequence(groupStart, groupEnd);
            }
        }
    }
}