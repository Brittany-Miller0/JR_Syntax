package One_JavaSyntax.task.task_5.task_09;

 /*
 * Создать класс Friend
 * создать 3 метода initialize (3 инициализатора)
 * Имя
 * Имя, возраст
 * Имя, возраст, пол
 * String, int, char
 */

public class Solution {
    public static void main(String[] args) {
    }

    static class Friend {

        private String name;
        private int age;
        private char sex;

        public void initialize(String name) {
            this.name = name;
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void initialize(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
