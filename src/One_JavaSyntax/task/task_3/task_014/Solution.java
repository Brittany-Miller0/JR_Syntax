package One_JavaSyntax.task.task_3.task_014;

 /*
 * Таблица умножения 10*10
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
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