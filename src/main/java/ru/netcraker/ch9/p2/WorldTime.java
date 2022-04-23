package ru.netcraker.ch9.p2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class WorldTime {
    public static String getTime() {
        final Date currentTime = new Date();

        final SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");

        // Give it to me in GMT time.
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        return "GMT time: " + sdf.format(currentTime);
    }
}
