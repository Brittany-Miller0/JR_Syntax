package One_JavaSyntax.task.task_5.task_027;

 /*
 * Том и Джерри
 * Создать классы Dog, Cat, Mouse
 * Добавить любые 3 поля
 * Создать объекты для героев мультика Том и Джерри
 */

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        //напишите тут ваш код
        Cat tomCat = new Cat("Tom", 40, 10);
        Dog spikeDog = new Dog("Spike", 60, 6);
    }

    //напишите тут ваш код
    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}