package One_JavaSyntax.task.task_2.task_07;

 /*
 * Считаем длину окружности
 * L = 2 * PI * radius (в методе)
 * Результат (double)
 * PI = 3.14
 */

public class Solution {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        //напишите тут ваш код
        double L = 2 * PI * radius;
        System.out.println(L);
    }
}
