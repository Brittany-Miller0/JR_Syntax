package One_JavaSyntax.task.task_4.task_01;

 /*
 * Мне не подходит этот возраст…
 * Исправить ошибку, чтобы переменная age объекта person
 * изменила свое значение.
 */

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("Age in adjustAge() is: " + age);
        }
    }
}
