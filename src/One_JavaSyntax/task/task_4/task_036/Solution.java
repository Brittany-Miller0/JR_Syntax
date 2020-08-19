package One_JavaSyntax.task.task_4.task_036;

 /*
 * Рисуем прямоугольник
 * Ввести с клавиатуры m и n
 * используя (for) вывести
 * прямоугольник размером m & n из 8
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}