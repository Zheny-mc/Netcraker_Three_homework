package ru.netcraker.ch9.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static int getHours() {
        return Integer.parseInt(getTime().split(":")[0]);
    }

    public static int getMinutes() {
        return Integer.parseInt(getTime().split(":")[1]);
    }


}
