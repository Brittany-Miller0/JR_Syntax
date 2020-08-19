package One_JavaSyntax.task.task_4.task_016;

 /*
 * Переходим дорогу вслепую
 * В начале каждого часа (3х минут) - горит зеленый
 * В течении 1 минуты - желтый
 * в течении 1 минуты - красный
 * и т.д
 * Ввести вещественное число t, означающее время в минутах
 * Определить, сигнал какого цвета горит для пешеходов.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        double t = Double.parseDouble(num);

        t %= 5;
        if (t >= 0 && t < 3) {
            System.out.println("зеленый");
        } else if (t >= 3 && t < 4) {
            System.out.println("желтый");
        } else if (t >= 4) {
            System.out.println("красный");
        }
    }
}




