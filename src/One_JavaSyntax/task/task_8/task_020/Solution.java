package One_JavaSyntax.task.task_8.task_020;

 /*
 * Нам повторы не нужны
 * Создать словарь Мар<String,String> занести в него 10 записей Фамилия, Имя
 * Удалить людей, имеющих одинаковые имена.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Miller1", "Brittany1");
        map.put("Miller2", "Brittany2");
        map.put("Miller3", "Jen");
        map.put("Miller4", "Brittany3");
        map.put("Miller5", "Brittany4");
        map.put("Miller6", "Brittany5");
        map.put("Miller7", "Brittany");
        map.put("Miller8", "Brittany");
        map.put("Miller9", "Brittany");
        map.put("Miller10", "Brittany");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> map2 = new HashMap<>(map);
        Map<String, String> map3 = new HashMap<>(map);

        for (Map.Entry<String, String> pair : map2.entrySet()) {
            map3.remove(pair.getKey());
            if (map3.containsValue(pair.getValue()))
                removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}