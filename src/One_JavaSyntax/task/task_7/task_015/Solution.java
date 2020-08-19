package One_JavaSyntax.task.task_7.task_015;

 /*
 * Слова в обратном порядке.
 * Введите с клавиатуры 5 слов в список строк.
 * Удали 3-ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
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
            String str = reader.readLine();
            list.add(str);
        }
        list.remove(2);

        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.println(list.get(j));
        }
    }
}

