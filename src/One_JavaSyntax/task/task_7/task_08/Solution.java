package One_JavaSyntax.task.task_7.task_08;

 /*
 * Самая длинная строка
 * Создать список
 * Считать с клавиатуры 5 строк и добавить в список.
 * Используя цикл, ищем самую длинную строку в списке.
 * Выводим на экран, если их 2, то обе выводим на экран.
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

        int min = Integer.MIN_VALUE;
        for (String str : list) {
            if (str.length() > min) {
                min = str.length();
            }
        }
        for (String str : list) {
            if (str.length() == min) {
                System.out.println(str);
            }
        }
    }
}

