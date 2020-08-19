package One_JavaSyntax.task.task_7.task_013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

  /*
 * 1.Ввод целых чисел с клавиатуры.
 * 2.Четные числа добавляются в конец списка, нечетные в начало.
 * 3.Удаление всех чисел больше 5.
 * 4.Разделение массива на два - четных и нечетных чисел.
 * 5.Слияние списков.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        //Ввод списка целых чисел с клавиатуры
        while (true) {
            String str = reader.readLine();
            if (str.isEmpty()) break;
            list.add(Integer.parseInt(str));
        }

        //Четные числа добавляются в конец списка, нечетные в начало
        while (true) {
            String str = reader.readLine();
            if (str.isEmpty()) break;

            int x = Integer.parseInt(str);
            if (x % 2 == 0) {
                list.add(x);
            } else {
                list.add(x);
            }
        }

        //Удаление всех чисел больше 5
        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size(); ) {
            if (list.get(i) > 5) {
                list.remove(i);
            } else {
                i++;
            }
        }

        //Разделение массива на два - четных и нечетных чисел
        int[] arr = {1, 4, 5, 11, 3, 13, 25};

        for (int i = 0; i < arr.length; i++) {
            list.add(i);
        }

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int y = 0; y < list.size(); y++) {
            Integer x = list.get(y);
            if (x % 2 == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }
        }

        //Слияние списков
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 23, 4, 6, 7, 8, 123, 5);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 5, 7, 34, 567, 3, 12, 6);

        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(list1);
        result.addAll(list2);

        for (Integer x : result) {
            System.out.println(x);
        }
    }
}
