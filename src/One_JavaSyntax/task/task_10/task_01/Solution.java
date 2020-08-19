package One_JavaSyntax.task.task_10.task_01;

 /*
 * Задача №1 на преобразование целых типов
 * Раставить правильно операторы приведения типа, чтобы получить ответ d > 0
 * int a = 0;
 * int b = (byte) a + 46;
 * byte c = (byte) (a * b);
 * double f = (char) 1234.15;
 * long d = (short) (a + f / c + b);
 */

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) (a + 46); //46
        byte c = (byte) (a * b);
        double f = 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}