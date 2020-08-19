package One_JavaSyntax.task.task_6.task_04;

 /*
 * Ставим котов на счётчик
 * В конструкторе Cat увеличивать счетчик котов
 * Статическую переменную catCount нa 1
 * В методе finalize уменьшать на 1
 */

class Solution {
    public static int catCount = 0;

    public static void main(String[] args) {
    }

    class Cat {
        //напишите тут ваш код
        public Cat() {
            catCount++;
        }

        protected void finalize() throws Throwable {
            catCount--;
        }
    }
}