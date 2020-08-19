package One_JavaSyntax.task.task_5.task_021;

 /*
 * Вызов конструктора из конструктора
 * Исправить конструктор с двумя параметрами так, чтобы он вызывал другой
 * конструктор с радиусом 10
 */

public class Solution {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }

    static class Circle {

        public double x;
        public double y;
        public double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public Circle(double x, double y) {
            //напишите тут ваш код
            this(x, y, 10.0);
        }

        public Circle() {
            this(5, 5, 1);
        }
    }
}