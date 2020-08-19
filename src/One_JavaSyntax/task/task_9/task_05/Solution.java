package One_JavaSyntax.task.task_9.task_05;

/*
 * Стек-трейс длинной 10 вызовов
 * Написать код, чтобы получить стек-трейс длинной 10 методов
 * main() - не менять.
 *
 * Создаем стек типа StackTraceElement в котором хранится инфа о поседовательности выполнения методов начиная с main()
 *
 * StackTraceElement[] ste = Thread.currentThread().getStackTrace();
 * Имя стека ste (заносим в него весь стек-трейс) Все, что справа от "="
 *
 * В этом стеке будет Х элементов. Вот их описание:
 *
 * [0] - getStackTrace
 * [1] - метод, где находится данный стек-трейс
 * [2] - метод, вызвавший [1]
 *
 * [x] - последний элемент стека main
 * sout(stackTraceLength(); // В main - длина трейса
 *
 * stackTraceLength - это имя переменной, в которую сохраняем длинну массива стек-трейс.
 *
 * Стек-трейс - это массив некоторых объектов, с ним можно работать, как и с любым другим массивом.
 * Раньше - String[] str = initializeArray();
 *
 */

public class Solution {
    public static void main(String[] args) {
        int stackTraceLength = method1().length - method10().length + 1;
        System.out.println(stackTraceLength);
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
        return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        return method4();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        return method5();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return method6();
    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        return method7();
    }

    public static StackTraceElement[] method7() {
        //напишите тут ваш код
        return method8();
    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}