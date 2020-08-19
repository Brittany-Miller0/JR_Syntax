package One_JavaSyntax.task.task_9.task_011;

 /*
 * Исключение при работе с массивами
 * Перехватить исключение (и вывести на экран), указав тип, возникающее при выполнение кода:
 * int[] m = new int[2];
 * m[8] = 5;
 */

public class Solution {
    public static void main(String[] args) {

        //напишите тут ваш код
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}