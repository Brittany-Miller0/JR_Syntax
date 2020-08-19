package One_JavaSyntax.task.task_9.task_022;

 /*
 * Написать в цикле обпратный отсчет от 10 до 0.
 * Для задержки использовать Thread.sleep(100);
 * Обернуть вызов sleep в try..catch
 * */

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            try {
                Thread.sleep(100);
            } catch (Throwable e) {
                System.out.println(e);
            }
        }
    }
}