package One_JavaSyntax.task.task_7.task_022;

 /*
 * Минимаксы в массивах
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальные числа через пробел
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] arr = getInts();

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minimum) {
                minimum = arr[i];
            }

            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }
}

    /*    static int getMaximum(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++)
            if (max < list.get(i))
                max = list.get(i);
        return max;
    }*/

    /*  static int getMinimum(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++)
            if (min > list.get(i))
                min = list.get(i);
        return min;
    }*/
