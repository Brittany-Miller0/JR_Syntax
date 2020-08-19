package One_JavaSyntax.task.task_5.task_019;

 /*
 * Ходим по кругу
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class Circle {
        private int centerX;
        private int centerY;
        private int radius;
        private int color;
        private int width;

        public Circle(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public Circle(int centerX, int centerY, int radius, int width) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
        }

        public Circle(int centerX, int centerY, int radius, int width, int color) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }
    }
}
