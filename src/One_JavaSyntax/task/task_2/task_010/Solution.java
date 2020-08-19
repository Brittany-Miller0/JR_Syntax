package One_JavaSyntax.task.task_2.task_010;

/*
 * Макс, Белла и Джек.
 * Создать 3 объекта типа Dog.
 * Сохранить каждый экземпляр в отдельную переменную.
 */

public class Solution {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        //напишите тут ваш код
        dog1.name = "Max";
        dog2.name = "Bella";
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
