package One_JavaSyntax.task.task_5.task_011;

 /*
 * Создать класс Dog с 3мя инициализаторами
 * Имя
 * Имя, рост
 * Имя, рост, цвет
 */

public class Solution {
    public static void main(String[] args) {
    }

    static class Dog {
        private String name;
        private String color;
        private int height;

        public void initialize(String name) {
            this.name = name;
        }

        public void initialize(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public void initialize(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }
}
