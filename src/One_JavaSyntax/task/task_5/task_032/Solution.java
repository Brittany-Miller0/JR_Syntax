package One_JavaSyntax.task.task_5.task_032;

 /*
 * Задача по алгоритмам
 * Программа, которая считывает число N, которое должно быть больше 0
 * Потом считывает N чисел с консоли
 * Выводит максимальное из введеных N чисел
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n <= 0) return;
        int maximum = Integer.parseInt(reader.readLine());
        for (int i = n; i > 1; i--) {
            maximum = Math.max(Integer.parseInt(reader.readLine()), maximum);
            System.out.println(maximum);
        }
    }
}
