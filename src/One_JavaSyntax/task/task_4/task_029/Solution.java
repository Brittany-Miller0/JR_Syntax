package One_JavaSyntax.task.task_4.task_029;

 /*
 * Положительные и отрицательные числа
 * Введите с клавиатуры 3 целых числа
 * Вывести на экран количество положительных и
 * количество отрицательных чисел.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static int plus = 0;
    public static int minus = 0;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        op(Integer.parseInt(reader.readLine()));
        op(Integer.parseInt(reader.readLine()));
        op(Integer.parseInt(reader.readLine()));
        System.out.println("количество отрицательных чисел: " + minus);
        System.out.println("количество положительных чисел: " + plus);
    }

    public static void op(int a) {
        if (a > 0) plus++;
        else if (a < 0) minus++;
    }
}

