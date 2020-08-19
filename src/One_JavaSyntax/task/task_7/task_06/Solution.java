package One_JavaSyntax.task.task_7.task_06;

 /*
 * Улицы и дома
 * Создать массив на 15 целых чисел.
 * Ввести в него значения с клавиатуры.
 * Пуская индекс - номер дома, а значение - число жителей.
 * Дома с нечетными номерами расположены на одной улице, с четными на другой.
 * На какой улице проживает больше людей.
 * Вывести: В домах с нечетными номерами проживает больше жителей.
 * В домах с четными номерами проживает больше жителей.
 * 0 - четное.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int sum1 = 0;
    public static int sum2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
            if (i % 2 == 0 || i == 0) {
                sum1 += num;
            }
            if (i % 2 != 0) {
                sum2 += num;
            }
        }

        if (sum1 > sum2)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
