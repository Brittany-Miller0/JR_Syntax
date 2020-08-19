package One_JavaSyntax.task.task_9.task_014;

 /*
 * Исключение при работе с числами
 * Перехватить исключение (и вывести на экран), указав тип
 * int num = Integer.parseInt("XYZ");
 * System.out.println(num);
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}