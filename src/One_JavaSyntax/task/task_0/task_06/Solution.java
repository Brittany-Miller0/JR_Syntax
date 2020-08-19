package One_JavaSyntax.task.task_0.task_06;

 /*
 * Комментарии излишни
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y; //y = 2 + 12  (14)

        x = y - x; //x = 14 - 2  (12)
        y = y - x; //y = 14 - 12 (2)

        System.out.println(x);
        System.out.println(y);
    }
}
