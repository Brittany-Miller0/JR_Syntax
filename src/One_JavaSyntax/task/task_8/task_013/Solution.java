package One_JavaSyntax.task.task_8.task_013;

 /*
 * Время для 10к вызовов get
 * Измерить сколько занимает 10к вызовов get для каждого списка
 * Метод getGetTimeInMs должен вернуть своего исполнителя в мллс.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date date1 = new Date();
        long n1 = date1.getTime();

        get10000(list);

        // напишите тут ваш код
        Date date2 = new Date();
        long n2 = date2.getTime();
        return (n2 - n1);
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}