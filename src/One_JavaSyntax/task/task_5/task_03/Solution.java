package One_JavaSyntax.task.task_5.task_03;

 /*
 * getters and setters for class Dog
 * Создать класс Dog
 * String name, int age get(), set()
 */

public class Solution {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }

    static class Dog {
        String name;
        int age;

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
    }
}
