package One_JavaSyntax.task.task_10.task_015;

 /*
 * Массив списков строк
 * Создать массив, элементами которого будут списки строк.
 * Заполнить массив любыми данными и вывести их на экран.
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayLists = new ArrayList[3];
        for (int i = 0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList<>();
            arrayLists[i].add("123");
            arrayLists[i].add("231");
            arrayLists[i].add("321");
        }
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}