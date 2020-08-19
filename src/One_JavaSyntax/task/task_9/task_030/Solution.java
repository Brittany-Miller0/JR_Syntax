package One_JavaSyntax.task.task_9.task_030;

 /*
 * Десять котов
 * Создать словарь Мар <String, Cat> и добавить туда 10 котов в виде ИМЯ-КОТ
 * Получить из Мар множество (Set) всех котов и вывести его на экран.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("Name1", new Cat("cat1"));
        map.put("Name2", new Cat("cat2"));
        map.put("Name3", new Cat("cat3"));
        map.put("Name4", new Cat("cat4"));
        map.put("Name5", new Cat("cat5"));
        map.put("Name6", new Cat("cat6"));
        map.put("Name7", new Cat("cat7"));
        map.put("Name8", new Cat("cat8"));
        map.put("Name9", new Cat("cat9"));
        map.put("Name10", new Cat("cat10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<>(map.values());
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}