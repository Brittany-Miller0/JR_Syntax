package One_JavaSyntax.task.task_4.task_043;
 /*
 * Суммирование
 * Вводить с клавиатуры числа
 * и если пользователь ввел -1 заверщаем программу
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int sum = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        while (true) {
            a = Integer.parseInt(reader.readLine());
            sum += a;
            if (a == -1) break;
        }
        System.out.println(sum);
    }
}


