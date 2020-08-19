package One_JavaSyntax.task.task_9.task_013;

 /*
 * Исключение при работе с коллекциями Map
 * Перехватить исключение (и вывести его на экран), указав тип при:
 * HashMap<String, String> map = new HashMap<String, String>(null);
 * map.put(null, null);
 * map.remove(null);
 */

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        //напишите тут ваш код
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
