package One_JavaSyntax.task.task_9.task_07;

 /*
 * Логирование стек-трейса
 * Реализовать метод log
 * Он должен выводить на экран имя класса и имя метода (log), а также переданное сообщение.
 * Имя класса, имя метода, и сообщение разделить ":"
 */

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + ": " +
                Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + s);
    }
}