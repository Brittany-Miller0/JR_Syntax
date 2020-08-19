package One_JavaSyntax.task.task_6.task_06;

 /*
 * Классовый счетчик
 * Создать статическую переменную int catCount в классе Cat
 * Создать конструктор, в котором увеличивай данную переменную на 1
 */

public class Solution {
    public static int catCount = 0;

    public static void main(String[] args) {
    }

    class Cat {
        //напишите тут ваш код
        public Cat() {
            catCount++;
        }
    }
}
