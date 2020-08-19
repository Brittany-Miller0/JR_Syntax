package One_JavaSyntax.task.task_4.task_039;

 /*
 * Письмо счастья
 * Ввести с клавиатуры имя и через for
 * 10 раз запустить его
 * "имя" любит меня.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int x = 1; x <= 10; x++) System.out.println(name + " любит меня.");
    }
}
