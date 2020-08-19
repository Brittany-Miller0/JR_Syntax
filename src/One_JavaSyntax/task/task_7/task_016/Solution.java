package One_JavaSyntax.task.task_7.task_016;

 /*
 * Продолжаем мыть раму
 * Создать список из слов "мама", "мыла", "раму".
 * После каждого слова вставить в список строку, содержащую слово "именно".
 * Вывести результат на экран, каждый элемент списка с новой строки.
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr = {"мама", "мыла", "раму"};

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            list.add("именно");
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
