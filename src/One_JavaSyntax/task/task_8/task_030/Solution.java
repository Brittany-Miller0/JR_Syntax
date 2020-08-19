package One_JavaSyntax.task.task_8.task_030;

 /*
 * Работа с датой
 * 1.Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество
 * дней с начала года - нечетное число, иначе false
 * 2.String date передается в формате FEBRUARY 1 2013
 * не забудь учесть 1 день года
 */

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date start = new Date(date);
        start.setMonth(0);
        start.setDate(0);
        Date today = new Date(date);
        long msDistance = today.getTime() - start.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msDistance / msDay);

        if (dayCount % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}