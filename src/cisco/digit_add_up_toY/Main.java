package cisco.digit_add_up_toY;
import java.util.*;
// 有两个数，X和Y， 写一个算法，实现：
// 在所有小于等于X的数字里，寻找各位加起来等于Y的数字
// 例如：X=20， Y=5
// 符合要求的数字：5，14
public class Main {
    public static void main(String[] args){
        int X = 20;
        int Y = 5;
        find_valid_nums(X,Y);
    }
    public static int sum_of_digits(int num){
        int sum = 0;
        while (num > 0){
            int unit = num % 10;
            sum +=unit;
            num /=10;
        }
        return sum;
    }

    public static void find_valid_nums(int upper_bound, int unit_sum) {
        int count = 0;
        for(int i = 0; i < upper_bound; i++) {
            if (sum_of_digits(i) == unit_sum) {
                System.out.println(i);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("no numbers could meet the requirements");
        } else {
            System.out.println("there are " + count + " valid integers");
        }

    }
//    public static void matchXAndY(int X, int Y) {
//        // find the digits sum of Y
//        int length = String.valueOf(X).length();
//        System.out.println(length);
//        int count = 0;
//        for (int i = 1; i <= length; i++) {
//            count+= getNumber(i, 0, 0, Y, X);
//        }
//        if (count == 0) {
//            System.out.println(-1);
//        } else {
//            System.out.println(count);
//        }
//    }
//    private static int getNumber(int index, int num,
//                                 int result, int target, int bound) {
//        if (num > bound) return 0;
//        if (index == 0) {
//            if (result == target) return 1;
//            else return 0;
//        }
//        int count = 0;
//        for (int i = 1; i < 10; i++) {
//            count += getNumber(index - 1, num * 10 + i,
//                    result + i, target, bound);
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int X = scanner.nextInt();
//        int Y = scanner.nextInt();
//        matchXAndY(X, Y);
//    }
}