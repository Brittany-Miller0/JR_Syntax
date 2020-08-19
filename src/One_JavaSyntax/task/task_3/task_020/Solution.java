package One_JavaSyntax.task.task_3.task_020;


/*
 * Скромность украшает программиста
 * Ввести с клавиатуры name и вывести:
 * name зарабатывает $5,000. Ха-ха-ха!
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
