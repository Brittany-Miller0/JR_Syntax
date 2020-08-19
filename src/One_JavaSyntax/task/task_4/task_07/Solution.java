package One_JavaSyntax.task.task_4.task_07;

 /*
 * Кошки во Вселенной
 * Написать код, чтобы правильно считалось количество
 * созданных кошек и вывести на экран
 */

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;
        //напишите тут ваш код

        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
