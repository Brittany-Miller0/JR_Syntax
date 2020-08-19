package One_JavaSyntax.task.task_5.task_018;

 /*
 * Регистрируем собачек
 * В классе Dog (3 конструктора)
 * Имя
 * Имя, рост
 * Имя, рост, цвет
 */

public class Solution {
    public static void main(String[] args) {
    }

    public class Dog {
        private String name;
        private String color;
        private int height;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }
}
