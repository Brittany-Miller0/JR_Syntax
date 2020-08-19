package One_JavaSyntax.task.task_7.task_012;

/*
 * Самые-самые
 * Создать список строк.
 * Добавить в него 10 строчек с клавиатуры.
 * Узнать какая строка встретиться раньше (самая короткая или самая длинная)
 * Если таких строк несколько, то должны быть учтены самые первые из них.
 * Выведи на экран строку.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int min = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int y = 1; y < list.size(); y++) {

            if (list.get(min).length() < list.get(y).length()) {
                min = y;
            }

            if (list.get(max).length() > list.get(y).length()) {
                max = y;
            }
        }

        if (min < max) {
            System.out.println(list.get(min));
        } else {
            System.out.println(list.get(max));
        }
    }
}
