package One_JavaSyntax.task.task_5.task_013;

 /*
 * Собираем прямоугольник
 * Rectangle (top, left, width, height)
 * Создать для него много initialize
 */

public class Solution {
    public static void main(String[] args) {

    }

    public static class Rectangle {
        private int top;
        private int left;
        private int width;
        private int height;

        public void initialize(int top) {
            this.top = top;
            this.left = 1;
            this.width = 2;
            this.height = 3;
        }

        public void initialize(int top, int left) {
            this.top = top;
            this.left = left;
            this.width = 0;
            this.height = 0;
        }

        public void initialize(int top, int left, int width) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = width;
        }

        public void initialize(int top, int left, int width, int height) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }

    }
}
