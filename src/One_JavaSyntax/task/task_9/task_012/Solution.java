package One_JavaSyntax.task.task_9.task_012;

 /*
 * Исключение при работе с коллекциями List
 * Перехватить исключение (и вывести на экран), возникающее при выполнении кода:
 * ArrayList<String> list = new ArrayList<String>();
 * String s - list.get(18);
 */

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        //напишите тут ваш код
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}