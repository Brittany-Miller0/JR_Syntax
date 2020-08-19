package One_JavaSyntax.task.task_8.task_09;

 /*
 * ArrayList vs LinkedList
 * Коллекции могут быть реализованы разными способами и не единственного - правильного.
 * При одном подходе одни операции являются быстрыми, а остальные медленными, при другом - наоборот.
 * Каждая реализация была оптимизирована для какого-то узкого набора операций.
 *
 * Array & ArrayList
 * 2[0] 23 [1] a [2] dd [3] 7a [4]
 *
 * ArrayList - реализован внутри в виде обысчного массива.
 * Поэтому при вставке элемента в середину, приходится сначала сдвигать
 * на один все элементы после него, а затем в освободившееся место вставлять новый элемент.
 *
 * Зато в нем быстро реализованы взятие и изменение элемента - операции get, set
 * так как в них мы просто обращаемся к соответствующему элементу массива.
 *
 * LinkedList
 * null <- 2 -> 23     ->  a  -> dd  ->  7a  -> null
 *           <- (head) <-     <-     <-  (tail)
 *
 * LinkedList - реализован в виде связанного списка: набора отдельных элементов,
 * каждый из которых хранит ссылку на следующий и предыдущий элементы.
 * Чтобы вставить элемент в середину такого списка, достаточно поменять ссылки на его будущих соседей.
 * А вот чтобы получить элемент с номером 130, нужно пройтись последовательно по всем элементам от 0 до 130.
 * get, set реализованы медленно.
 *
 * Если ты собираешься вставлять (или удалять), то лучше использовать LinkedList
 * В остальных ArrayList
 */

public class Solution {
    public static void main(String[] args) {

    }
}
