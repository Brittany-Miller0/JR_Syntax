package One_JavaSyntax.task.task_2.task_015;

 /*
 * Минимум двух чисел
 */

public class Solution {

    public static int min(int a, int b) {
        //напишите тут ваш код
        int x;
        if (a < b) {
            x = a;
        } else {
            x = b;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
