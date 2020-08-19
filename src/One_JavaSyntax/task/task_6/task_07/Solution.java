package One_JavaSyntax.task.task_6.task_07;

 /*
 * Статические методы для кошек
 * Добавить к классу Cat два статических метода:
 * C помощью которых можно получить/изменить количество котов (catCount)
 */

public class Solution {
    public static void main(String[] args) {
    }

    static class Cat {
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        public static int getCatCount() {
            //напишите тут ваш код
            return catCount;
        }

        public static void setCatCount(int catCount) {
            //напишите тут ваш код
            Cat.catCount = catCount;
        }
    }
}