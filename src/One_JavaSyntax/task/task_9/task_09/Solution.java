package One_JavaSyntax.task.task_9.task_09;

 /*
 * Перехватить исключение, возникающее при выполнении кода:
 * int a = 42/0;
 * Вывести на экран тип перехваченного ислючения
 */

public class Solution {
    public static void main(String[] args) throws NullPointerException {
        //напишите тут ваш код

        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    private static void method() {
        int a = 42 / 0;
        System.out.println(a);
    }
}