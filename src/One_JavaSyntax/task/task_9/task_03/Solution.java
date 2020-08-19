package One_JavaSyntax.task.task_9.task_03;

 /*
 * И снова StackTrace
 * Написать 5 методов, которые вызывают друг друга.
 * Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью stackTrace
 * Чтобы вернуть номер вызванного метода (нужно в каждом методе возвращать
 *              6        5         4           3          2          1             0
 * Стек такой main -> method1 -> method2 -> method3 -> method4 -> method5 -> getStackTrace
 * stackTrace[2], потому что stackTrace[0] - получение стека, stackTrace[1] - сам метод.
 */

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[5].getMethodName();
    }
}