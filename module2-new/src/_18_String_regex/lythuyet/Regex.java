package _18_String_regex.lythuyet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {


    public static final String REGEX = "(090|093)[0-9]{6}[^9]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher("0931234560");
        if(matcher.matches()){
            System.out.println("OK");
        } else{
            System.out.println("NG");
        }
    }
}
