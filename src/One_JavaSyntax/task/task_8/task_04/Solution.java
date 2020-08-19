package One_JavaSyntax.task.task_8.task_04;

 /*
 * Коллекция Мар из котов
 * Создать класс Cat  с полем имя (name String)
 * Создать коллекцию Map<String, Cat> (HashMap)
 * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
 * Вывести результат на экран, каждый элемент с новой строки.
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
    }

    static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
