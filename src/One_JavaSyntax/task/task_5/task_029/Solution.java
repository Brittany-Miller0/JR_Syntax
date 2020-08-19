package One_JavaSyntax.task.task_5.task_029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 /*
 * Консоль копилка
 * Вводить с клавиатуры числа и считать их сумму, пока
 * пользователь не введете слово "сумма"
 * Вывести на экран полученную сумму.
 */

public class Solution {

    public static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();
            if (str.equals("сумма")) {
                break;
            } else {
                int number = Integer.parseInt(str);
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
