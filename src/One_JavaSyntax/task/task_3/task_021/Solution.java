package One_JavaSyntax.task.task_3.task_021;

 /*
 * Большая и чистая
 * Ввести с клавиатуры три имени,вывести надпись:
 * name1 + name2 + name3 = Чистая любовь, да-да!
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}