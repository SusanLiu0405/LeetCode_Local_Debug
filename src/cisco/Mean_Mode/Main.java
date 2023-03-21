package cisco.Mean_Mode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] test_array={1,2,7,3,2};
        System.out.println("mean= "+mean(test_array));
        System.out.println("mode= "+mode(test_array));
    }
    public static double mean(int[] m) {
        if(m.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int j : m) {
            sum += j;
        }
        return sum / m.length;
    }
    public static int mode(int[] a) {
        if(a.length == 0) {
            return 0;
        }
        int maxFreq = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            int freq = map.getOrDefault(i, 0);
            freq++;
            map.put(i, freq);
            maxFreq = Math.max(freq, maxFreq);
        }
        return maxFreq;
    }

}