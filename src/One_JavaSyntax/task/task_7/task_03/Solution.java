package One_JavaSyntax.task.task_7.task_03;

 /*
 * Общение одиноких массивов
 * Создать массив на 10 строк
 * Создать массив на 10 чисел
 * Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * В каждую ячейку массива числе записать длинну строки из массива строк
 * индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];
        String[] str = new String[10];

        for (int i = 0; i < 10; i++) {
            str[i] = reader.readLine();
            num[i] = str[i].length();
        }
        for (int num1 : num) {
            System.out.println(num1);
        }

      /*  for (String num2 : str) {
            System.out.println(num2);
      }*/
    }
}
