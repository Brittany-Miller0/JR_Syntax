package One_JavaSyntax.task.task_2.task_016;

 /*
 * Минимум трёх чисел
 */

public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int x;
        if (a < b) {
            x = a;
        } else {
            x = b;
        }
        if (x < c) {
            return x;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
