package One_JavaSyntax.task.task_4.task_026;

 /*
 * Ярлыки и числа
 * Ввод с клавиатуры целого числа
 * отрицательное четное число
 * отрицательное нечетное число
 * ноль (равно 0)
 * положительное четное число
 * положительное нечетное число
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int a = Integer.parseInt(num);

        if ((a > 0) && (a % 2 == 0)) System.out.println("положительное четное число");
        if ((a > 0) && (a % 2 != 0)) System.out.println("положительное нечетное число");
        if (a == 0) System.out.println("ноль");
        if ((a < 0) && (a % 2 == 0)) System.out.println("отрицательное четное число");
        if ((a < 0) && (a % 2 != 0)) System.out.println("отрицательное нечетное число");
    }
}