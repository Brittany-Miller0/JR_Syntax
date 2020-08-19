package One_JavaSyntax.task.task_5.task_025;

 /*
 * И целой утки мало
 * По аналогии с классом Duck
 * создать классы Cat(), Dog()
 * Что должен возвращать метод toString (Cat, Dog)
 * Создать по 2 объекта в методе main()
 */

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
}