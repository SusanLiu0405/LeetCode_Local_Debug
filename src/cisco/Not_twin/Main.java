package cisco.Not_twin;
//
public class Main {
    public static void main(String[] args) {
        int[] test_array = {1,1,2,2,3,3,4};
        System.out.println(firstSingle(test_array));
    }

    public static int firstSingle(int[] array) {
        // corner case
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1) {
            return array[0];
        }

        // general case
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] && (i == array.length - 1 || array[i] != array[i + 1])) {
                return array[i];
            }
        }
        return -1;
    }
}