package One_JavaSyntax.task.task_4.task_019;

 /*
 * Максимум четырех чисел
 * Ввести с клавиатуры 4 числа
 * и вывести максимальное из них.
 * Если равны, то вывести любое.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();
        String num4 = reader.readLine();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);
        int d = Integer.parseInt(num4);

        if (max(a, b) < (max(c, d))) {
            if (c < d) {
                System.out.println(d);
            } else {
                System.out.println(c);
            }
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }

    public static int max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}
