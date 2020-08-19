package One_JavaSyntax.task.task_5.task_01;

 /*
 * Создание кота
 * Создать класс Cat.
 * У кота должно быть имя (name,String)
 * Возраст (age),Вес (weight),Сила (strength, int)
 */

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }

    static class Cat {
        //напишите тут ваш код
        String name;
        int age;
        int weight;
        int strength;
    }
}
