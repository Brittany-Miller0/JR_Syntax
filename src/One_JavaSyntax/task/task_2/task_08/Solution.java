package One_JavaSyntax.task.task_2.task_08;

 /*
 * Наш первый конвертер!
 * TF = (9/5) * TC + 32
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        //напишите тут ваш код
        double TF = (9 / 5.0) * celsius + 32;
        return TF;
    }
}
