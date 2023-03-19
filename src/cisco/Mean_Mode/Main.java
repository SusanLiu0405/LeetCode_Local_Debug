package cisco.Mean_Mode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static double mean(int[] m) {
        double sum = 0;
        for (int j : m) {
            sum += j;
        }
        return sum / m.length;
    }
    public static int mode(int[] a) {
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