package One_JavaSyntax.task.task_4.task_020;

 /*
 * Сортировка трех чисел
 * Ввести с клавиатуры 3 числа, и вывести в порядке убывания
 * Выведенные числа должны быть разделены пробелом.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);

        //methodN(a, b, c);

        int tmp;
        for (int x = 0; x < 2; x++) {
            if (a < b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            if (b < c) {
                tmp = b;
                b = c;
                c = tmp;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }

 /*   public static void methodN(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            System.out.println(c + " " + b + " " + a);
        } else if ((a < c) && (c < b)) {
            System.out.println(b + " " + c + " " + a);
        } else if ((b < a) && (a < c)) {
            System.out.println(c + " " + a + " " + b);
        } else if ((b < c) && (c < a)) {
            System.out.println(a + " " + c + " " + b);
        } else if ((c < a) && (a < b)) {
            System.out.println(b + " " + a + " " + c);
        } else {
            System.out.println(a + " " + b + " " + c);
        }
    }*/
}
