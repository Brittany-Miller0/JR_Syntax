package One_JavaSyntax.task.task_7.task_014;

 /*
 * Играем в Jолушку
 * 1.Вводим с клавиатуры 20 чисел, сохраняем их в список и рассортировываем по 3м другим спискам:
 * Число нацело делится на 3 (x % 3 == 0), число нацело делится на 2 (x % 2 == 0) и все остальное.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * 2.Метод printList должен выводить на экран все элементы с новой строки.
 * 3.Используя метод printList выведи 3 списка
 * сначала (/3), затем (/2) и последний.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 3 == 0) {
                if (x % 2 == 0) {
                    list3.add(x);
                    list2.add(x);
                } else list2.add(x);
            } else if (x % 2 == 0) {
                list3.add(x);
            } else
                list4.add(x);
        }
        printList(list3);
        printList(list2);
        printList(list4);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer num1 : list) {
            System.out.println(num1);
        }
    }
}
