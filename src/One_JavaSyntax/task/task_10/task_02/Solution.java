package One_JavaSyntax.task.task_10.task_02;

 /*
 * Задача №2 на преобразование целых типов
 * Расставить правильно операторы приведения типа, чтобы получить овтет: d = 3.765
 */

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c =  a / (float) b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}