package One_JavaSyntax.task.task_4.task_042;

 /*
 * Как-то средненько
 * Ввести с клавиатуры 3 числа, и вывести среднее из них
 * Если числа равны, вывести любое.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sFirst = br.readLine();
        String sSecond = br.readLine();
        String sThird = br.readLine();
        int nFirst = Integer.parseInt(sFirst);
        int nSecond = Integer.parseInt(sSecond);
        int nThird = Integer.parseInt(sThird);
        System.out.println(middleNumber(nFirst, nSecond, nThird));

    }

    public static int middleNumber(int a, int b, int c) {
        int tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c) {
            b = c;
        }
        if (a > b) {
            b = a;
        }
        return b;
    }
}