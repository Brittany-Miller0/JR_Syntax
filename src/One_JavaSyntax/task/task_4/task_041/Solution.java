package One_JavaSyntax.task.task_4.task_041;

/*
 * Как-то средненько
 * Ввести с клавиатуры 3 числа, и вывести среднее из них
 * Если числа равны, вывести любое.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int i = (a + b + c) / 3;

        if ((a == b) && (b == c) && (c == a)) {
            System.out.println(a);
        } else if (average(a - i) <= average(b - i) && average(a - i) <= average(c - i))
            System.out.println(a);
        else if (average(b - i) <= average(a - i) && average(b - i) <= average(c - i)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }

    public static int average(int a) {
        if (a > 0) return a;
        else return -a;
    }


}
