package One_JavaSyntax.task.task_2.task_01;

 /*
 * Реализуем метод print (4)
 */

public class Solution {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");

    }

    public static void print(String s) {
        //напишите тут ваш код
        for (int x = 0; x < 4; x++) {
            System.out.println(s);
        }
    }
}
