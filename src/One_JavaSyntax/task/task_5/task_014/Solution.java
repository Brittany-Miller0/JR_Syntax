package One_JavaSyntax.task.task_5.task_014;

 /*
 * Программист создает человека
 * Создать class Person
 * String name;
 * int age;
 * Создать метод initialize(String name, int age)
 * В методе main создать объект Person и занесть его ссылку в переменную персон
 * Вызвать метод initialize с любыми значениями
 */

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Brittany", 19);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
