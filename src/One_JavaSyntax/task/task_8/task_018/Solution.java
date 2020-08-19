package One_JavaSyntax.task.task_8.task_018;

 /*
 * Перепись населения
 * Создать словарь Мар<String,String> занести в него десять записей "Фамилия" "Имя"
 * Проверить сколько людей имеют совпадающие с заданным именем и фамилией.
 */

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Сергеев", "Антон");
        map.put("Иванов", "Петя");
        map.put("Стаханов", "Жора");
        map.put("Сталин", "Иосиф");
        map.put("Куриев", "Артур");
        map.put("Сколов", "Антон");
        map.put("Воробев", "Станичлав");
        map.put("Сергеева", "Антон");
        map.put("Глодин", "Паша");
        map.put("Кинг", "Стивен");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (name.equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (lastName.equals(key)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
    }
}