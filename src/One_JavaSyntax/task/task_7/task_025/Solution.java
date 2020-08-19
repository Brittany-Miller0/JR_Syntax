package One_JavaSyntax.task.task_7.task_025;

 /*
 * Обратный отсчет
 * Написать программу, которая ведет обратный отсчет с 30 до 0, а в конце выводит на экран
 * текст "Бум"
 * Программа должна уменьшать число 10 раз в секунду
 * Для задержки, функция:
 * Thread.sleep(100);
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
            //напишите тут ваш код
        }
        System.out.println("Бум!");
    }
}