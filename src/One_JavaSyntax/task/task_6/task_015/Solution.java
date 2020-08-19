package One_JavaSyntax.task.task_6.task_015;

 /*
 * Феншуй и статики
 * Поставь один модификатор static, чтобы пример компилировался
 */

public class Solution {

    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}