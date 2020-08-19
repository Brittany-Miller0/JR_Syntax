package One_JavaSyntax.task.task_7.task_09;

  /*
 * Выражаемся покороче
 * Создать список строк.
 * Считать с клавиатуры 5 строк и добавить в список.
 * Использовать цикл, найти самую короткую строку в списке.
 * Вывести найденную строку на экран.
 * Если несколько то, вывести каждую с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int max = Integer.MAX_VALUE;
        for (String string : list) {
            if (string.length() < max) {
                max = string.length();
            }
        }

        for (String string : list) {
            if (string.length() == max) {
                System.out.println(string);
            }
        }
    }
}



