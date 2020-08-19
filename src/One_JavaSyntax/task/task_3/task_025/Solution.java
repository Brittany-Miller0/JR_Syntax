package One_JavaSyntax.task.task_3.task_025;

 /*
 * Финансовые ожидания
 * Я буду зарабатывать $n в час
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        int n = Integer.parseInt(n1);
        System.out.println("Я буду зарабатывать $" + n + " в час");
    }
}