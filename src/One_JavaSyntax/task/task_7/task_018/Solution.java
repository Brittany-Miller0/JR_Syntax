package One_JavaSyntax.task.task_7.task_018;

  /*
 * Удваиваем слова
 * Введи с клавиатуры 10 слов в список строк.
 * doubleValues - должен удваивать слова. альфа -> альфа, альфа.
 * Вывести результат с новой строки.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();

        for (int i = 0; i < 3; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        //Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i + 1, list.get(i));
        }
        return list;
    }
}