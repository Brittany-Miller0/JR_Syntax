package One_JavaSyntax.task.task_8.task_017;

 /*
 * Больше 10? Вы нам не подходите
 * Создать множество чисел (Set<Integer>) занести туда 20 различных числе
 * Удалить из множества все числа больше 10
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(1 + i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            Integer k = iterator.next();
            if (k > 10) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
    }
}

/*Iterator<Integer> iterator = set.iterator();

   while (iterator.hasNext()) {
   Integer k = iterator.next();
   if (k > 10)
   iterator.remove();

}*/

