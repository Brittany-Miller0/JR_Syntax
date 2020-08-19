package One_JavaSyntax.task.task_9.task_010;

 /*
 * Исключение при работе со строками
 * Перехвати исключение (и вывести его на экран), указав тип, возникающее при выполнении
 * String s = null;
 * String m = s.toLowerCase();
 */

public class Solution {
    public static void main(String[] args) {

        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}