package One_JavaSyntax.task.task_4.task_028;

 /*
 * Положительное число
 * Ввести с клавиатуры 3 целых числа
 * Вывести количество положительных чисел
 * среди этих 3х.
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

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);

        int x = 0;
        if (a > 0) x++;
        if (b > 0) x++;
        if (c > 0) x++;
        System.out.println(x);

    }


}