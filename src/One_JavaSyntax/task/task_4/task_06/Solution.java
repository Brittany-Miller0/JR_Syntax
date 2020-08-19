package One_JavaSyntax.task.task_4.task_06;

/*
Программа учета имен
*/

public class Solution {

    public static class Cat {
        private String fullName;

        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            //напишите тут ваш код
            this.fullName = fullName;
        }

        public static void main(String[] args) {
        }
    }
}