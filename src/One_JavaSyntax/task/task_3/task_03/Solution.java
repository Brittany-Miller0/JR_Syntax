package One_JavaSyntax.task.task_3.task_03;

 /*
 * Обмен валют
 * ДолларСША = евро * курс
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(10, 1.17));
        System.out.println(convertEurToUsd(15, 1.17));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //напишите тут ваш код
        double dollar = eur * exchangeRate;
        return dollar;

    }
}
