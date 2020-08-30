import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameTest {


    public static void main(String[] args) {
        String name = "asfdafsdg";
        String name2 = "qaf*=as1dsg";
        System.out.println(name.matches("[a-zA-Z0-9_-]{3,15}"));
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{3,15}",name));
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{3,15}",name2));

        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{3,15}&");
        Matcher m = p.matcher(name2);
        System.out.println(m.matches());



    }
}
