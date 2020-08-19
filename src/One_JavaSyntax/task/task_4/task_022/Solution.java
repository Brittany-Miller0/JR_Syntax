package One_JavaSyntax.task.task_4.task_022;

 /*
 * 18+
 * Ввести с клавиатуры имя и возраст.
 * Если он меньше 18 вывести: "Подрасти еще"
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String num = reader.readLine();
        int age = Integer.parseInt(num);

        if (age < 18) {
            System.out.println(name + ", Подрасти еще!");
        }
    }
}