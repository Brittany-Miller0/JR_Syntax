package One_JavaSyntax.task.task_8.task_022;

 /*
 * Set из котов
 * 1.Внутри класса Solution создать public static class - Cat
 * 2.Реализовать метод createCats, он должен создавать множество Set котов и добавлять
 * в него 3 кота.
 * 3.В методе main удалить одного кота из Set(cats)
 * 4.Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
 * Каждый кот с новой строки.
 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(cats.iterator().next());
        printCats(cats);
    }


    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat("Меркурий"));
        cats.add(new Cat("Венера"));
        cats.add(new Cat("Земля"));
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
        String name;

        public Cat() {
        }

        public Cat(String name) {
            this.name = name;
        }
    }
}