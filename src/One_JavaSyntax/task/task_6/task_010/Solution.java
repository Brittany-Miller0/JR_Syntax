package One_JavaSyntax.task.task_6.task_010;

 /*
 * Класс StringHelper
 * Сделать класс StringHelper, у которого будут 2 статических метода:
 * multiply (2 parameters) - возвращает строку повторенную count раз.
 * multiply (1 parameter) - возвращает строку повторенную 5 раз.
 */

public class Solution {

    static class StringHelper {
        public static String multiply(String s) {
            String result = " ";
            //напишите тут ваш код
            for (int x = 0; x < 5; x++) {
                result += s;
                System.out.print(result);
            }
            return result;
        }

        public static String multiply(String s, int count) {
            String result = "";
            //напишите тут ваш код
            for (int x = 0; x < count; x++) {
                result += s;
                //System.out.print(s);
            }
            return result;
        }

        public static void main(String[] args) {
            multiply("Lol");
            System.out.println();
            //multiply("a", 15);
        }
    }
}