package cisco.Alphabetical_Order;

public class Main {
    public static void main(String[] args) {
        String teststring = "dcba";
        System.out.println(isInorder(teststring));
    }
    public static int isInorder(String s) {
        // corner case
        if (s == null || s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 0;
        // general case
        char[] array = s.toCharArray();
        char previous = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < previous)
                return i;
            previous = array[i];
        }
        return 0;
    }
}