package One_JavaSyntax.task.task_3.task_026;

 /*
 * Сумма цифр трехзначного числа
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        //5 + 4 + 6
        return number / 100 + number / 10 % 10 + number % 10;
    }
}