package One_JavaSyntax.task.task_4.task_05;

 /*
 * Задаем количество котов
 * Метод должен устанавливать количество котов.
 */

public class Solution {

    public static class Cat {
        private static int catsCount = 0;

        public static void setCatsCount(int catsCount) {
            //напишите тут ваш код
            Cat.catsCount = catsCount;
            System.out.println(catsCount);
        }

        public static void main(String[] args) {
            setCatsCount(1);
            setCatsCount(2);
            setCatsCount(3);
            setCatsCount(2);
        }
    }
}