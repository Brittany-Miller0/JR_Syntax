package One_JavaSyntax.task.task_2.task_017;

 /*
 * Минимум четырех чисел
 * */

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        if (min(a, b) < min(c, d)) {
            return min(a, b);
        } else {
            return min(c, d);
        }
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));

    }
}
