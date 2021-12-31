package practice.traffic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

    private Long startTime;
    private Long endTime;

    public void init(String line) {
        try {
            String[] stringArray = line.split(" ");
            String stringDate = stringArray[0] + " " + stringArray[1];

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            Date endDate = sdf.parse(stringDate);
            endTime = endDate.getTime();
            double parseDouble = Double.parseDouble((stringArray[2].substring(0, stringArray[2].length() - 1)));
            Long duration = (long) (parseDouble * 1000);
            startTime = endTime - duration;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isIn(Long startCheck, Long endCheck) {
        if(endTime < startCheck || startTime >= endCheck) {
            return false;
        }
        return true;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Log{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
