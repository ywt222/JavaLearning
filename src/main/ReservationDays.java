package main;

import java.util.Arrays;
import java.util.List;

public class ReservationDays {
    private String inputInfo;

    public ReservationDays(String inputInfo) {
        this.inputInfo = inputInfo;
    }

    public int[] getReservationDate() {
        int start = inputInfo.indexOf(":");
        String dates = inputInfo.substring(start + 1);

        List<String> dateArray = getDateArray(dates);
        return classifyWeekdate(dateArray);
    }

    private List<String> getDateArray(String dates) {
        String[] datesString = dates.split(",");
        return Arrays.asList(datesString);
    }

    private int[] classifyWeekdate(List<String> dateArray) {
        int weekday = 0;
        int weekend = 0;

        for (String date : dateArray) {
            String weekdate = date.substring(date.indexOf("(") + 1, date.indexOf(")"));
            if (weekdate.equals("sat") || weekdate.equals("sun")) {
                weekend++;
            } else weekday++;
        }

        int[] daysCount = {weekday, weekend};
        return daysCount;
    }
}
