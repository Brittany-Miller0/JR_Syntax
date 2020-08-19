package One_JavaSyntax.task.task_3.task_04;

 /*
 * Задача на проценты
 */

public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double percent = (i * 0.1) + i;
        return percent;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
