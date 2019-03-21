package HomeWork.FindRoots.Time;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String phrase;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int time = calendar.get(Calendar.HOUR_OF_DAY);

        if (time < 3) {
            phrase = "night";
        } else if (time < 11) {
            phrase = "morning";
        } else if (time < 18) {
            phrase = "afternoon";
        } else phrase = "evening";

        System.out.println(phrase);
    }
}
