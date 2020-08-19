package One_JavaSyntax.task.task_4.task_03;

 /*
 * Как зовут кота?
 */

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }


    static class Cat {
        private String name = "безымянный кот";

        public void setName(String name) {
            //напишите тут ваш код
            this.name = name;
        }
    }
}