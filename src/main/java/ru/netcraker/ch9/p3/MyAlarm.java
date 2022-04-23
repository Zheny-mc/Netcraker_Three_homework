package ru.netcraker.ch9.p3;

import java.util.Timer;
import java.util.TimerTask;

public class MyAlarm extends TimerTask {

    @Override
    public void run() {
        System.out.println("Time: " + CurrentTime.getTime());
        completeTask();
    }

    private void completeTask() {
        try {
            // допустим, выполнение займет 20 секунд
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void setAlarm(int time) {
        TimerTask timerTask = new MyAlarm();
        // стартуем TimerTask в виде демона

        Timer timer = new Timer("test", true);
        // будем запускать каждую секунд (1 * 1000 миллисекунд)
        timer.scheduleAtFixedRate(timerTask, 0, 1*1000);
        System.out.println("TimerTask начал выполнение");

        // вызываем cancel() через какое-то время
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask прекращена");
    }

    public static void clearAlarm() {

    }
}