package One_JavaSyntax.task.task_3.task_022;

 /*
 * Полнометражная картина
 * Перевод сантиметров в метры
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код
        double x = centimetre * 0.01;
        return (int) x;
    }
}
