package One_JavaSyntax.task.task_8.task_015;

 /*
 * Самая длинная последовательность
 * Создать список чисел.
 * Добавить в список 10 чисел с клавиатуры.
 * Вывести на экран длинну самой длинной последовательности повторяющихся чисел в списке
 * 2, 4, 4, 4, 8, 8, 4, 12, 12, 14
 * Вывод : 3  (3 четверки)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(reader.readLine()));
        }

        int tmp = 1, theOutCome = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                tmp++;
                if (tmp >= theOutCome) theOutCome = tmp;
            } else tmp = 1;
        }
        /*if ((tmp == theOutCome) & list.get(9).equals(list.get(8))) {
        }*/
        System.out.println(theOutCome);
    }
}