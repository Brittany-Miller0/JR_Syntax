package One_JavaSyntax.task.task_5.task_08;

 /*
 * Создать class Person
 * String name;
 * int age;
 * char sex;
 * Создать геттеры и сеттеры для всех переменных класса Person
 */

public class Solution {
    public static void main(String[] args) {

    }

    static class Person {
        String name;
        int age;
        char sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }
    }
}
