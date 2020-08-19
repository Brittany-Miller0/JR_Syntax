package One_JavaSyntax.task.task_8.task_07;

 /*
 * Коллекция Мар из Object
 * Есть коллекция Мар<String, Object> HashMap, туда занесли 10 различных пар
 * объектов.
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry<String, Object> pair : map.entrySet()) {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}