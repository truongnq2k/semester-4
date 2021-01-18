
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author hacken006
 */
public class test {

    public static void main(String[] args) {
        String input = ".net and c#".toLowerCase();
        Matcher matcher = Pattern.compile("(?:^| )[^a-z]*[a-z]").matcher(input);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group().toUpperCase());
        }
        System.out.println(matcher.appendTail(result));

    }
}
