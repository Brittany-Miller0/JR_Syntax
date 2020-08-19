package One_JavaSyntax.task.task_9.task_029;

/*
 * Список из массивов чисел
 * Создать список, элементами которого будут массивы чисел.
 * Добавить в список пять объектов-массивов длинной 5,2,4,7,0
 * Заполнить массивы любыми данными и вывести их на экран.
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2};
        int[] c = {1, 2, 3, 4};
        int[] d = {1, 2, 3, 4, 5, 6, 7};
        int[] e = {};
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}