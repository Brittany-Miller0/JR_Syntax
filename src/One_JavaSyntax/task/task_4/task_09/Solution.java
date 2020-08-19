package One_JavaSyntax.task.task_4.task_09;

 /*
 * Ближайшее к 10
 * Метод должен выводить на экран
 * ближайшее к 10 из 2х чисел
 */

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);

    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        if (abs(10 - a) < abs(10 - b)) {
            System.out.println(a);
        } else if (abs(10 - a) == abs(10 - b)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}