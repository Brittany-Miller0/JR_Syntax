package One_JavaSyntax.task.task_4.task_034;

 /*
 * Таблица умножения 10*10
 * while
 */

public class Solution {
    public static void main(String[] args) {

        int x = 1;
        while (x <= 10) {
            int y = 1;
            while (y <= 10) {
                System.out.print(x * y + " ");
                y++;
            }
            System.out.println("");
            x++;
        }
    }
}
