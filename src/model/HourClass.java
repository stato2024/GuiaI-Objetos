package model;

public class HourClass {

    private Integer hour;
    private Integer minute;
    private Integer seconds;

    public HourClass(Integer hour, Integer minute, Integer seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }


}
