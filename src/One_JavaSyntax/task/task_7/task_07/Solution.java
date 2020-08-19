package One_JavaSyntax.task.task_7.task_07;

 /*
 * Что за список такой?
 * Создать список строк
 * Добавить в него 5 различных строк.
 * Используя цикл вывести его содержимое на экран (с новой строки)
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        str.add("E");

        System.out.println(str.size());

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}
