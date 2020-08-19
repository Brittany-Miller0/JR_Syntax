package One_JavaSyntax.task.task_7.task_023;

 /*
 * Это конец
 * Создать список строк.
 * Ввести строки с клавиатуры и добавить их в список.
 * Вводить с клавиатуры строки, пока пользователь не введет строку "end".
 * Саму строку "end" не учитывать
 * Вывести строки на экран, каждую с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            String s = reader.readLine();
            list.add(s);
            if (s.equals("end")) {
                list.remove(s);
                break;
            }
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}