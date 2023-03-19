package cisco.Valid_Latitide_Longitude;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void latiLongPairs(List<String> input) {
        String regexLatLong = "\\([-+]?(([1-8]?[0-9])(\\.\\d+)?|90(\\.0+)?),[-+]?(([1-9]?[0-9]|1[0-7][0-9])(\\.\\d+)?|180(\\.0+)?)\\)";
        Pattern pattern = Pattern.compile(regexLatLong);
        for (String cur : input) {
            Matcher matcher = pattern.matcher(cur);
            if (matcher.find())
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}