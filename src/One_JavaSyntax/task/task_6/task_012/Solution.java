package One_JavaSyntax.task.task_6.task_012;

/*
 * Калькулятор
 */

public class Solution {

    static class Calculator {
        public static int plus(int a, int b) {
            //напишите тут ваш код
            int pl = a + b;
            return pl;
        }

        public static int minus(int a, int b) {
            //напишите тут ваш код
            int min = a - b;
            return min;
        }

        public static int multiply(int a, int b) {
            //напишите тут ваш код
            int mul = a * b;
            return mul;
        }

        public static double division(int a, int b) {
            //напишите тут ваш код
            double div = (double) a / (double) b;
            return div;
        }

        public static double percent(int a, int b) {
            //напишите тут ваш код
            double per = ((double) (a * b) / 100);
            return per;
        }

        public static void main(String[] args) {
            System.out.println(plus(2, 3));
            System.out.println(minus(2, 3));
            System.out.println(multiply(2, 3));
            System.out.println(division(2, 3));
            System.out.println(percent(2, 3));
        }
    }
}