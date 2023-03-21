package cisco.Valid_Latitide_Longitude;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> input_list = new ArrayList<>();
        String a = "(90, 180)";
//        String b = "(+90,+180)";
//        String c = "(90.,180)";
//        String d = "(90.0,180.1)";
//        String e = "(85S,95W)";
        input_list.addAll(Arrays.asList(a));
        System.out.println(latiLongPairs(input_list));
    }
    public static String latiLongPairs(List<String> input) {
        String regexLatLong = "\\([-+]?(([1-8]?[0-9])(\\.\\d+)?|90(\\.0+)?),[-+]?(([1-9]?[0-9]|1[0-7][0-9])(\\.\\d+)?|180(\\.0+)?)\\)";
        Pattern pattern = Pattern.compile(regexLatLong);
        String flag="";
        for (String cur : input) {
            Matcher matcher = pattern.matcher(cur);
            if (matcher.find())
                flag="Valid";
            else
                flag="Invalid";
        }
        return flag;
    }
}