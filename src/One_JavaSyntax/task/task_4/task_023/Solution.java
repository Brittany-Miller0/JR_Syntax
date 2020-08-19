package One_JavaSyntax.task.task_4.task_023;

 /*
 *Фейс-контроль
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

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}