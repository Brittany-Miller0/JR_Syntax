package One_JavaSyntax.task.task_4.task_024;

 /*
 * Три числа
 * Ввести с клавиатуры 3 целых числа.
 * Вывести отличный от других порядковый номер числа.
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

        if (a == b) System.out.println(3);
        else if (a == c) System.out.println(2);
        else if (b == c) System.out.println(1);
    }
}
