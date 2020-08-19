package One_JavaSyntax.task.task_5.task_07;

 /*
 * Среднее арифметическое
 * Вводить с клавиатуры числа и вычислить среднее арифметическое
 * Если пользователь ввел -1
 * Вывести среднее арифметическое всех чисел и завершить программу.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;
        int count = 0;
        while (true) {
            double number = Double.parseDouble(reader.readLine());
            sum += number;
            count++;
            if (number == -1) {
                break;
            }
        }
        System.out.println((sum + 1) / (count - 1));
    }
}
