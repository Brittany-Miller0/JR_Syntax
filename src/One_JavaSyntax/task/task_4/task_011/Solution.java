package One_JavaSyntax.task.task_4.task_011;

 /*
 * Времена года на Терре
 * По номеру месяца, месяц должен определить
 * время года (зима, весна, лето, осень) и
 * Вывести на экран
 */

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Нет такого месяца!");
        }

    }
}
