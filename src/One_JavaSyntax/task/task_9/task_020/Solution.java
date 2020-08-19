package One_JavaSyntax.task.task_9.task_020;

/*
 * Все свои, даже исключения
 * Унаследовать так, чтобы появились любые 2 checked исключения и
 * любые 2 unchecked исключения
 *
 */

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends RuntimeException {
    }

    static class MyException2 extends RuntimeException {
    }

    static class MyException3 extends IOException {
    }

    static class MyException4 extends IOException {
    }
}