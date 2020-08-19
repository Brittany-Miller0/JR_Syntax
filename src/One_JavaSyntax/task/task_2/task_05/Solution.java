package One_JavaSyntax.task.task_2.task_05;

 /*
 * Прибавка к зарплате
 * В методе hackSalary увеличить з/п на 100
 * Вывести: "Твоя з/п составляет: a+100 долларов в месяц."
 */

public class Solution {
    public static void main(String[] args) {
        hackSalary(700);
    }

    public static void hackSalary(int a) {
        // напишите тут ваш код
        int x = a + 100;
        System.out.println("Твоя зарплата составляет: " + x + " долларов в месяц.");
    }
}
