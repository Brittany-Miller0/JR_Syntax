package One_JavaSyntax.task.task_8.task_019;

 /*
 * Добрая Зинаида и летние каникулы
 * Создать словарь Мар<String,Date> и занести в него десять записей по принципу
 * "Фамилия", "дата рождения"
 * Удалить из словаря всех людей, родившихся летом.
 */

import java.text.*;
import java.util.*;

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        //напишите тут ваш код
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Пугачева", dateFormat.parse("MAY 6 2000"));
        map.put("Зайцева", dateFormat.parse("MAY 6 2000"));
        map.put("Гордеева", dateFormat.parse("AUGUST 6 2000"));
        map.put("Курганский", dateFormat.parse("JUNE 6 2000"));
        map.put("Наумов", dateFormat.parse("MAY 1 2000"));
        map.put("Miller", dateFormat.parse("JULY 6 2000"));
        map.put("Рыжова", dateFormat.parse("MAY 6 2000"));
        map.put("Темнов", dateFormat.parse("MAY 6 2000"));
        map.put("Романов", dateFormat.parse("MAY 6 2000"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            int month = date.getMonth();
            if ((month == 5) || (month == 6) || (month == 7))
                iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}

