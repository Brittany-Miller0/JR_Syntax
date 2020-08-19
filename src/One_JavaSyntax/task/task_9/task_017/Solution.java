package One_JavaSyntax.task.task_9.task_017;

 /*
 * Перехват выборочных исключений
 */

import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws IOException {
        try {
            handleExceptions();
        } catch (Exception e) {
            BEAN.log(e);
        }
    }

    public static void handleExceptions() throws FileNotFoundException, FileSystemException {
        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        } catch (CharConversionException e) {
            BEAN.log(e);
        } catch (IOException e) {
            BEAN.log(e);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}