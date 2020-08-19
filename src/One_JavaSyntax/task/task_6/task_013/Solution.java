package One_JavaSyntax.task.task_6.task_013;

 /*
 * Кот и статика
 * В классе Cat создать статическую переменную public int catCount
 * создать конструктор
 * При каждом создании кота (new Object)
 * Статическая переменная увеличивается на 1
 * Создать 10 объектов Cat и вывести значение переменной catCount на экран.
 */

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        for (int x = 0; x < 10; x++) {
            Cat cat = new Cat();
        }

        // Выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {

        // Создай статическую переменную catCount
        public static int catCount = 0;

        // Создай конструктор
        public Cat() {
            catCount++;
        }
    }
}