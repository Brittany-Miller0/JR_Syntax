package One_JavaSyntax.task.task_5.task_023;

 /*
 * Конструктор
 * Исправить ошибку в классе Circle
 */

public class Solution {

    static class Circle {
        public Color color;

        public static void main(String[] args) {
            Circle circle = new Circle();
            circle.color.setDescription("Red");
            System.out.println(circle.color.getDescription());
        }

        public Circle() {
            color = new Color();
        }

        public class Color {
            String description;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
}