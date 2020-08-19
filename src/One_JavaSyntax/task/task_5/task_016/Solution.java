package One_JavaSyntax.task.task_5.task_016;

 /*
 * Друзей не купишь
 * Создать класс Friend
 * с 3мя конструкторами
 * -Имя
 * -Имя, возраст
 * -Имя, возраст, пол
 */

public class Solution {
    public static void main(String[] args) {
    }

    public class Friend {
        private String name;
        private int age;
        private char sex;

        public Friend(String name) {
            this.name = name;
        }

        public Friend(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Friend(String name, int age, char sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
}
