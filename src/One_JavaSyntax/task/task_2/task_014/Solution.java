package One_JavaSyntax.task.task_2.task_014;

/*
 * Питомцам нужны люди
 * Создать объект типа Cat, Dog, Fish, Woman
 * Присвоить каждому животному владельца (owner)
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman = new Woman();
        Cat cat = new Cat();
        cat.owner = woman;
        Dog dog = new Dog();
        dog.owner = woman;
        Fish fish = new Fish();
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
