package One_JavaSyntax.task.task_8.task_016;

 /*
 * 20 слов на букву «Л»
 * Создать множество Set<String> занести в него 20 слов на букву Л
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("Л" + i);
        }
        return set;
    }

    public static void main(String[] args) {
        createSet();
    }
}