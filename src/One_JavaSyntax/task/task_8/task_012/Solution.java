package One_JavaSyntax.task.task_8.task_012;

 /*
 * Время для 10к вставок
 * Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 * Метод getInsertTimeInMs должен вернуть своего исполнения в миллисекундах.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date date1 = new Date();
        long n1 = date1.getTime();

        insert10000(list);

        // напишите тут ваш код
        Date date2 = new Date();
        long n2 = date2.getTime();
        return (n2 - n1);
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}