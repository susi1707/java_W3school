package OOPs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pratices {
    public static void main(String[] args) {
        String ste = "susi usii susi6 and susis lang";
        Pattern p = Pattern.compile("[^0-9]");
        Matcher mat = p.matcher(ste);
        while(mat.find()){
            System.out.print(mat.group());
        }
    }
}
