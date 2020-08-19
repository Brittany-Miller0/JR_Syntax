package One_JavaSyntax.task.task_8.task_08;

 /*
 * Класс Date
 * С помощью этого класса можно хранить дату и время
 * А также изменять временные промежутки.
 *
 * Каждый объект типа Date хранит внутри себя время, (количество миллисекунд, с 1 января 1970) по Гринвичу.
 * Число огромное - приходится хранить в long.
 *
 * 1.Получение текущей даты
 * 2.Вычисление разницы между двумя датами.
 * 3.Настпупило ли уже некоторое время.
 * 4.Сколько прошло времени с начала сегодняшнего дня.
 * 5.Сколько дней прошло с начала года.
 */

import java.util.Date;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Получение текущей даты:
        Date today = new Date();
        System.out.println("Current date: " + today);

        //Вычисление разницы между двумя датами:
        Date currentTime = new Date(); //Получаем текущую дату
        Thread.sleep(3000);      //Ждем 3 секунды - 3000 миллисекунды
        Date newTime = new Date();     //Получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //Вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " is ms");

        //Настпупило ли уже некоторое время:
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000; //+5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);                  //ждем 3 секунды

        Date currentTime1 = new Date();
        if (currentTime1.after(endDate)) {         //Проверяем что время currentTime после endDate
            System.out.println("End Time!");
        }

        //Сколько прошло времени с начала сегодняшнего дня:
        Date currentTime2 = new Date();
        int hours = currentTime2.getHours();
        int mins = currentTime2.getMinutes();
        int secs = currentTime2.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

        //Сколько дней прошло с начала года:
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1); //первое число
        yearStartTime.setMonth(0); //январь

        Date currentTime4 = new Date();
        long msTimeDistance = currentTime4.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000; //сколько миллисекунд в сутках

        int dayCount = (int) (msTimeDistance / msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);

        //Метод getTime() - возвращает количество в миллисекундах, которое хранится в объекте Date
        //Метод after() - проверяет, что дата, у которой мы вызвали метод, идет после переданной в метод даты after
    }
}
