package One_JavaSyntax.task.task_4.task_015;

 /*
 * Правило треугольника
 * Ввести с клавиатуры 3 числа (a,b,c) - стороны треугольника
 * Вывести: Треугольник существует - если существует
 * (Существует, когда сумма двух сторон больше 3й)
 * (Нужно сравнить каждую сторону с суммой двух других)
 * Треугольник не существует:
 * (Если сторона окажется больше либо равна сумме 2х других)
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

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}