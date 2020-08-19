package One_JavaSyntax.task.task_5.task_031;

 /*
 * Совершенствуем функциональность
 * Вводим 5 чисел и выводим из них минимальное из них
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        System.out.println("Minimum = " + min(a, b, c, d, e));
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e) {
        int minOne = min(min(a, b), min(c, d));
        int minimum = min(minOne, e);
        return minimum;
    }
}
