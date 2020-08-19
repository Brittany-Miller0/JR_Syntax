package One_JavaSyntax.task.task_4.task_014;

 /*
 * Количество дней в году
 * Определить год (обычный 365 или високосный 366)
 * Если год / 400 без остатка, то это високосный.
 * Если делится без остатка на 100 - это обычный
 * Если год делится
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите год: ");
        String num = reader.readLine();
        int year = Integer.parseInt(num);

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("количество дней в году: 366");
        } else if ((year % 4 == 0) && (year % 400 == 0)) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}
