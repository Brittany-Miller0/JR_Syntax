package One_JavaSyntax.task.task_7.task_011;

 /*
 * Удалить и вставить
 * Создать список строк.
 * Добавить в него 5 строк с клавиатуры.
 * Выполнить 13 раз: удалить последнюю строку и вставить ее в начало.
 * Используя цикл вывести содержимое на экран, каждое значение с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (int x = 0; x < 13; x++) {
            list.add(0, list.get(4));
            list.remove(5);
        }

        for (int y = 0; y < 5; y++) {
            System.out.println(list.get(y));
        }
    }
}
