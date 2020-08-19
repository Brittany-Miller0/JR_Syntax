package One_JavaSyntax.task.task_4.task_018;

 /*
 * Минимум двух чисел
 * Ввести с клавиатуры 2 числа и вывести минимальное из них
 * Если числа равны, то вывести любое из них
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int a = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int b = Integer.parseInt(num2);

        if (a < b) {
            System.out.println(a);
        } else if (a > b) {
            System.out.println(b);
        } else if (a == b) {
            System.out.println(a);
        }

    }
}