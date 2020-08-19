package One_JavaSyntax.task.task_4.task_012;

 /*
 * Положительное и отрицательное число
 * Если число (+), то х2
 * Если число (-), то +1
 * Если число = 0, то 0
 * Результат вывести на экран.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        String num = reader.readLine();
        int number = Integer.parseInt(num);

        if (number > 0) {
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        } else {
            System.out.println(0);
        }
    }
}