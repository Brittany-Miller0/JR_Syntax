package One_JavaSyntax.task.task_6.task_08;

 /*
 * Расстояние между двумя точками
 * Реализовать статический метод, он должен вычислять
 * расстояние между точками.
 * Используйте метод, который вычисляет квадратный корень переданного параметра.
 */

public class Solution {
    public static void main(String[] args) {
    }

    static class Util {
        public static double getDistance(int x1, int y1, int x2, int y2) {
            //напишите тут ваш код
            int a = x1;
            int b = x2;
            int c = y1;
            int d = y2;

            double z = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            double AB = Math.abs(z);
            return AB;
        }
    }
}