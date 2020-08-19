package One_JavaSyntax.task.task_6.task_02;

 /*
 * Пустные кошки, пустые псы
 * В каждом классе Dog, Сat написать метод finalize
 * который выводит текст о том, что какой-то объект уничтожен
 */

public class Solution {
    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.finalize();
        dog.finalize();
    }

    public static class Cat {
        //напишите тут ваш код
        protected void finalize() throws Throwable {
            System.out.println("A Cat was destroyed");
        }
    }

    static class Dog {
        //напишите тут ваш код
        protected void finalize() throws Throwable {
            System.out.println("A Dog was destroyed");
        }
    }
}
