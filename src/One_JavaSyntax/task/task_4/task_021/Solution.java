package One_JavaSyntax.task.task_4.task_021;

 /*
 * Настя или Настя?
 * Ввести с клавиатуры 2 имени,
 * если одинаковые - то Имена идентичный,
 * если длины имен равны - то Длины имен равны,
 * Если имена и длины имен разные - ничего не выводить.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}