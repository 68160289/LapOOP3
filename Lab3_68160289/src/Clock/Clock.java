package Clock;

public class Clock {
    private int hour;
    private int minute;

    public Clock() {
        hour = 0;
        minute = 0;
    }

    public Clock(int hour, int minute) {
        if (hour < 24 && hour >= 0){
            this.hour = hour;
        } else{
            this.hour = 0;
            System.out.println("Hour is incorrect. Set hour to 0");
        }
        if (minute < 60 && minute >= 0) {
            this.minute = minute;
        }else {
            this.minute = 0;
            System.out.println("Minute is incorrect. Set Minute to 0");
        }
    }

    public void setTime(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void increaseMinute(){

        if (minute < 59) {
            minute++;
        }else if (hour <= 24){
            hour = 0;
            minute = 0;
        }
    }
    public void increaseHour(){
        if (hour < 24){
            hour++;
        }else {
            hour = 0;
        }
    }

    @Override
    public String toString() {
        return "Time " + hour +" : " + minute;
    }
}
