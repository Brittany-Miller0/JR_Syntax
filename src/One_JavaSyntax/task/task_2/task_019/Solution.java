package One_JavaSyntax.task.task_2.task_019;

 /*
 * Печатаем трижды
 */

public class Solution {
    public static void print3(String s) {
        //напишите тут ваш код
        for (int x = 0; x < 3; x++) {
            System.out.print(" " + s);
        }

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
