package One_JavaSyntax.task.task_4.task_037;

 /*
 * Треугольник из восьмерок
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int x = 1; x <= 10; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print(8);
            }
            System.out.println(" ");
        }
    }
}