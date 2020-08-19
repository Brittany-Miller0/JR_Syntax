package One_JavaSyntax.task.task_7.task_019;

 /*
 * Проверка на упорядоченность.
 * Введите с клавиатуры 10 слов в список строк.
 * Определить, является ли список упорядоченным по возрастанию длинны строки.
 * В случае отрицательного ответа вывести на экран индекс первого элемента нарушающего такую упорядоченость.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int y = 1; y < list.size(); y++) {
            if (list.get(y - 1).length() > list.get(y).length()) {
                //System.out.println(list.get(y - 1));
                System.out.println(y);
                break;
            }
        }
    }
}
