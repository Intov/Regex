import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String time = "";
        String text = "Завтрак начинается в 09:00";
        Pattern p = Pattern.compile("([01][0-9]|2[0-4]):([0-5][0-9])");
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            time = (text.substring(matcher.start(), matcher.end()));
        }
        System.out.println(time);
    }
}