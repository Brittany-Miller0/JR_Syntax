package One_JavaSyntax.task.task_5.task_012;

 /*
 * Создать класс Circle с 3мя инициализаторами
 * centerX, centerY, radius
 * centerX, centerY, radius, width
 * centerX, centerY, radius, width, color
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class Circle {

        private int color;
        private int centerX;
        private int centerY;
        private int radius;
        private int width;

        public void initialize(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public void initialize(int centerX, int centerY, int radius, int width) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }

        public void initialize(int centerX, int centerY, int radius, int width, int color) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }
    }
}
