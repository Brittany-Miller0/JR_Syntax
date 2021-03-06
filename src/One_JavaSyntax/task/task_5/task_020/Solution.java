package One_JavaSyntax.task.task_5.task_020;

 /*
 * Создать класс прямоугольник (Rectangle)
 * top, left, width, height
 * Создать 4 конструктора.
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class Rectangle {
        private int top;
        private int left;
        private int width;
        private int height;

        public Rectangle(int top) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }

        public Rectangle(int top, int left) {
            this.top = top;
            this.left = left;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int top, int left, int width) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = width;
        }

        public Rectangle(int top, int left, int width, int height) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }
    }
}
