package One_JavaSyntax.task.task_9.task_06;

 /*
 * Там, в синих глубинах стек-трейса…
 * Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем
 * (Количество элементов в списке)
 * Это же число метод должен выводить на экран.
 */

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        int a = stackTraceElement.length;
        System.out.println(a);
        return a;
    }
}