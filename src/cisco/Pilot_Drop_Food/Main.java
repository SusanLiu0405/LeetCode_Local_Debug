package cisco.Pilot_Drop_Food;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int dropPoints(int[] xCoordinate, int[] yCoordinate) {
        // corner case
        if (xCoordinate == null || yCoordinate == null || xCoordinate.length ==
                0 || yCoordinate.length == 0) return 0;
        // general case
        Map<Integer, Integer> xFreq = new HashMap<>(); // <xCoordinate, freq>
        Map<Integer, Integer> yFreq = new HashMap<>(); // <yCoordinate, freq>
        int xGlobalMaxFreq = 0;
        int yGlobalMaxFreq = 0;
        // traverse the x coordinates
        for (int i : xCoordinate) {
            int freq = xFreq.getOrDefault(i, 0);
            freq++;
            xFreq.put(i, freq);
            xGlobalMaxFreq = Math.max(xGlobalMaxFreq, freq);
        }
        // traverse the y coordinates
        for (int i : yCoordinate) {
            int freq = yFreq.getOrDefault(i, 0);
            freq++;
            yFreq.put(i, freq);
            yGlobalMaxFreq = Math.max(yGlobalMaxFreq, freq);
        }
        return Math.max(xGlobalMaxFreq, yGlobalMaxFreq);
    }

}