package One_JavaSyntax.task.task_4.task_032;

 /*
 * Хорошего много не бывает
 * Ввести с клавиатуры строку и число N > 0
 * Ввести строку N раз используя while
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int a = Integer.parseInt(reader.readLine());

        int x = 0;
        while (a > x) {
            a--;
            System.out.println(str);
        }
    }
}