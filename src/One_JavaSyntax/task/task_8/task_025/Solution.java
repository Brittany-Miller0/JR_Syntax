package One_JavaSyntax.task.task_8.task_025;

 /*
 * Минимальное из N чисел
 * 1.Ввести с клавиатуры число N
 * 2.Считать N целых чисел и заполнить ими список - метод getIntegerList
 * 3.Найти минимальное число среди элементов списка- метод getMinimum
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(reader.readLine());
            list.add(num);
        }
        return list;
    }
}