package One_JavaSyntax.task.task_10.task_06;

 /*
 * Задача №6 на преобразование целых типов
 */

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = (double) f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}