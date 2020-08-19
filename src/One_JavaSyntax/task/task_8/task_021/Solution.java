package One_JavaSyntax.task.task_8.task_021;

 /*
 * Только для богачей
 * Создать словарь Мар<String,Integer> и занести 10 записей по принципу
 * Фамилия - зарплата
 * Удалить из списка всех людей, у кого з/п ниже 500
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Miller1", 100);
        map.put("Miller2", 200);
        map.put("Miller3", 300);
        map.put("Miller4", 400);
        map.put("Miller5", 500);
        map.put("Miller6", 600);
        map.put("Miller7", 700);
        map.put("Miller8", 800);
        map.put("Miller9", 900);
        map.put("Miller10", 1000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}