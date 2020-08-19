package One_JavaSyntax.task.task_4.task_04;

 /*
 * Учет котов
 */

public class Solution {


    public static class Cat {
        private static int catsCount = 0;

        public static void addNewCat() {
            //напишите тут ваш код
            catsCount++;
        }

        public static void main(String[] args) {
            addNewCat();
            addNewCat();
        }
    }
}
