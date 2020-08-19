package One_JavaSyntax.task.task_9.task_015;

/*
 * Исключения. Просто исключения.
 * Есть метод, который выбрасывает два исключения, унаследованные от Exception и 2 от RuntimeException
 * NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException;
 * Нужно перехватить NullPointerException, FileNotFoundException, но не перехватывать ArithmeticException, URISyntaxException
 */

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        } catch (NullPointerException | FileNotFoundException e) {
        }
    }

    public static void method1() throws
            NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}