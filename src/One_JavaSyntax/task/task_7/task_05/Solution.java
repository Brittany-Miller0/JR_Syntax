package One_JavaSyntax.task.task_7.task_05;

 /*
 * Один большой массив и 2 маленьких
 * Создать массив на 20 чисел.
 * Ввести в него значения с клавиатуры.
 * Создать 2 массива на 10 чисел каждый.
 * Скопировать большой массив в 2 маленьких
 * Половину в первый, второю половину во 2й.
 * Вывести второй маленьких массив на экран, каждое значение выводить с новой строки.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrBig = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

        for (int i = 0; i < arrBig.length; i++) {
            arrBig[i] = Integer.parseInt(reader.readLine());
        }

        for (int j = 0; j < 10; j++) {
            small1[j] = arrBig[j];
            small2[j] = arrBig[20 / 2 + j];
            System.out.println(small2[j]);
        }
    }
}
