package One_JavaSyntax.task.task_6.task_020;

 /*
 * Исправляем ошибки юности
 * Программа вводит два числа с клавиатуры и выводит
 * их максимум в виде "The max is 25"
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int x = a > b ? a : b;

        System.out.println(max + x);
    }
}
