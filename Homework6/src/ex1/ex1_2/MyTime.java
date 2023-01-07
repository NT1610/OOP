package ex1.ex1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 && hour >= 24) {
            System.out.println("Invalid hour, minute, or second!");
        }
        if (minute < 0 && minute > 60) {
            System.out.println("Invalid hour, minute, or second!");
        }
        if (second < 0 && second > 60) {
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String strhour = String.valueOf(this.getHour());
        String strminute = String.valueOf(this.getMinute());
        String strsecond = String.valueOf(this.getSecond());
        if (this.getHour() < 9) {
            strhour = "0" + strhour;
        }
        if (this.getMinute() < 9) {
            strminute = "0" + strminute;
        }
        if (this.getSecond() < 9) {
            strsecond = "0" + strsecond;
        }
        return '\"' + strhour +
                ":" + strminute +
                ":" + strsecond +
                '"';
    }

    public MyTime nextSecond() {
        int nextSecond = this.getSecond() + 1;
        int nextMinute = this.getMinute();
        int nextHour = this.getHour();
        if (this.getSecond() == 59) {
            nextSecond = 0;
            nextMinute = this.nextMinute().getHour();
            nextHour = this.nextMinute().getHour();
        }
        return new MyTime(nextHour, nextMinute, nextSecond);
    }

    public MyTime nextMinute() {
        int nextMinute = this.getMinute() + 1;
        int nextHour = this.getHour();
        if (this.getMinute() == 59) {
            nextMinute = 0;
            nextHour = this.nextHour().getHour();
        }
        return new MyTime(nextHour, nextMinute, this.getSecond());
    }

    public MyTime nextHour() {
        int nextHour = this.getHour() + 1;
        if (this.getHour() == 23) {
            nextHour = 0;
        }
        return new MyTime(nextHour, this.getMinute(), this.getSecond());
    }

    public MyTime previousSecond() {
        int previousSecond = this.getSecond() - 1;
        int previousMinute = this.getMinute();
        int previuosHour = this.getHour();
        if (this.getSecond() == 0) {
            previousSecond = 59;
            previousMinute = this.previousMinute().getMinute();
            previuosHour = this.previousHour().getHour();
        }
        return new MyTime(previuosHour, previousMinute, previousSecond);
    }

    public MyTime previousMinute() {
        int previusMinute = this.getMinute() - 1;
        int previusHour = this.getHour();
        if (this.getMinute() == 0) {
            previusMinute = 59;
            previusHour = this.previousHour().getHour();
        }
        return new MyTime(previusHour, previusMinute, this.getSecond());
    }

    public MyTime previousHour() {
        int previusHour = this.getHour() - 1;
        if (this.getHour() == 0) {
            previusHour = 23;
        }
        return new MyTime(previusHour, this.getMinute(), this.getSecond());
    }

}


