package One_JavaSyntax.task.task_5.task_022;

 /*
 * Максимум конструкторов
 * Написать максимальное количество конструктором с разными аргументами
 */

public class Solution {
    public static void main(String[] args) {
    }

    public static class Circle {
        public double x;
        public double y;
        public double radius;

        //напишите тут ваш код
        public Circle() {

        }

        public Circle(double x) {
            this.x = x;
        }

        public Circle(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }
}
