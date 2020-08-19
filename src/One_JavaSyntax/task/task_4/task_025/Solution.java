package One_JavaSyntax.task.task_4.task_025;

 /*
 * Цель установлена!
 * Ввести 2 целых числа.
 * Вывести номер координатной четверти, в которой будет точка.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        if ((a > 0) & (b > 0)) System.out.println(1);
        if ((a < 0) & (b > 0)) System.out.println(2);
        if ((a < 0) & (b < 0)) System.out.println(3);
        if ((a > 0) & (b < 0)) System.out.println(4);
    }
}