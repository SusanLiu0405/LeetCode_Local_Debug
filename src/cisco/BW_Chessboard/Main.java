package cisco.BW_Chessboard;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static List<List<Character>> chessboard(int n) {
        List<List<Character>> board = new ArrayList<>();
// corner case
        if (n <= 0) return board;
// general case
        for (int i = 0; i < n; i++) {
            List<Character> rowAssignment = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    rowAssignment.add('W');
                } else {
                    rowAssignment.add('B');
                }
            }
            board.add(rowAssignment);
        }
        return board;
    }

}