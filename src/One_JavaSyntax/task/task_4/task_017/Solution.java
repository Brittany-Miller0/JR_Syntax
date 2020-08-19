package One_JavaSyntax.task.task_4.task_017;

 /*
 * Существует ли пара?
 * Ввести с клавиатуры 3 целых числа
 * Определить есть ли среди них хотя бы одна пара равный чисел
 * Если существует вывести через пробел,
 * если все 3 одинаковые, то вывести все 3.
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

        if ((a == b) & (b == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if ((b == c)) {
            System.out.println(b + " " + c);
        } else if ((c == a)) {
            System.out.println(c + " " + a);
        } else if (a == b) {
            System.out.println(a + " " + b);
        }
    }
}