package One_JavaSyntax.task.task_4.task_044;

 /*
 * Как назвали, так назвали
 * Введите с клавиатуры name
 * Ввести с клавиатуры дату рождения y,m,d
 * Меня зовут name.
 * Я родился d.m.y (3 числа)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int d = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
