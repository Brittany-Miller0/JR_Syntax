package One_JavaSyntax.task.task_7.task_017;

 /*
 * Создать список слов (заполнить самостоятельно)
 * Метод fix должен:
 * Удалять из списка строк все слова, содержащие букву "р"
 * Удваивать все слова содержащие букву "л"
 * Если слово содержит и "р" и "л" оставить это слово без изменений.
 * С другими словами ничего не делать
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        list = fix(list);

        for (String string : list) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л")) continue;
            if (list.get(i).contains("р")) {
                list.remove(i);
                i--;
            } else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i++;
            }
        }
        return list;
    }
}
