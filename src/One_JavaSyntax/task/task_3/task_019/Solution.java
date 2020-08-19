package One_JavaSyntax.task.task_3.task_019;

 /*
 * Предсказание на будущее
 * Ввести с клавиатуры отдельно Имя, число1, число2
 * "имя" получает "число1" через "число2" лет.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        System.out.println("Введите число1: ");
        String number1 = reader.readLine();
        int aNum1 = Integer.parseInt(number1);
        System.out.println("Введите число2: ");
        String number2 = reader.readLine();
        int aNum2 = Integer.parseInt(number2);
        System.out.println(name + " получает " + aNum1 + " через " + aNum2 + " лет.");
    }
}
