package One_JavaSyntax.task.task_4.task_033;

 /*
 * Гадание на долларовый счет
 * Вывести на экран квадрат 10*10
 * из S (while)
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 0;
        while (x < 10) {
            x++;
            System.out.println("");
            int y = 0;
            while (y < 10) {
                System.out.print("S");
                y++;
            }
        }
    }
}