package One_JavaSyntax.task.task_6.task_03;

 /*
 * По 50 000 объектов Cat и Dog
 * JVM должна уничтожить неиспользуемые,
 * и метод finalize хоть раз да вызовется
 */

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int x = 0; x < 50000; x++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}