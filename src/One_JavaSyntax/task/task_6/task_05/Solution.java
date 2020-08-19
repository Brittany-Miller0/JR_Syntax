package One_JavaSyntax.task.task_6.task_05;

 /*
 * Чётные и нечётные циферки
 * Ввести с клавиатуры положительное число.
 * Определить сколько в веденном числе четных цифр, а сколько нечетных
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
        int count = b.length();

        for (int x = 0; x < count; x++) {
            char ch = b.charAt(x);
            int c = Character.getNumericValue(ch);
            if (c != 0) {
                if (c % 2 == 0) even++;
                else odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
