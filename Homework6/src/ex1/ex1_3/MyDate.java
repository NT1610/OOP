package ex1.ex1_3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    public static final int[] DAYSINMONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (1 <= year && year <= 9999) {
            if (1 <= month && month <= 12) {
                if (month == 2 && isLeapYear(year) && day == 29) {
                    return true;
                }
                if (day == DAYSINMONTHS[month - 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int[] twoYearDigit = {4, 2, 0, 6};
        int newYear = year / 100;
        int key1 = 0;
        for (int i = 0; i < 4; i++) {
            if (((newYear - i) % 4) == 1) {
                key1 = twoYearDigit[i];
            }
        }
        int[][] monthTable = {
                {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5},
                {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5}
        };
        int key2 = 0;
        if (isLeapYear(year)) {
            key2 = monthTable[1][month - 1];
        }
        if (isLeapYear(year) == false) {
            key2 = monthTable[0][month - 1];
        }
        int output = (key1 + year % 100 + (year % 100) / 4 + key2 + day) % 7;
        return output;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            System.out.println("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 28 && day <= 31) {
            this.day = day;
        }
    }

    @Override
    public String toString() {
        String[] dayConvert = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        String dayOfWeek = DAYS[getDayOfWeek(year, month, day)];
        return dayOfWeek + " " + day + " " + month + " " + year;
    }

    public MyDate nextDay() {
        int nextDay = this.getDay() + 1;
        int nextMonth = this.getMonth();
        int nextYear = this.getYear();
        if (this.getDay() == DAYSINMONTHS[this.getMonth() - 1]) {
            nextDay = 1;
            nextMonth = this.nextMonth().getMonth();
            nextYear = this.nextMonth().getYear();
        }
        if (isLeapYear(this.getYear()) && this.getMonth() == 2 && this.getDay() == 29) {
            nextDay = 1;
            nextMonth = this.nextMonth().getMonth();
            nextYear = this.nextMonth().getYear();
        }
        return new MyDate(nextYear, nextMonth, nextDay);
    }

    public MyDate nextMonth() {
        int nextMonth = this.getMonth() + 1;
        int nextYear = this.getYear();
        int nextDay = this.getDay();
        if (this.getMonth() == 12) {
            nextMonth = 1;
            nextYear = this.nextYear().getYear();
        }
        if (isLeapYear(this.getYear()) && nextMonth == 2 &&
                this.getDay() == DAYSINMONTHS[this.getMonth() - 1]) {
            nextDay = 29;
        }
        if (this.getDay() == DAYSINMONTHS[this.getMonth() - 1]) {
            nextDay = DAYSINMONTHS[nextMonth - 1];
        }
        return new MyDate(nextYear, nextMonth, nextDay);
    }

    public MyDate nextYear() {
        int nextYear = this.getYear() + 1;
        int nextDay = this.getDay();
        if (isLeapYear(nextYear) && this.getMonth() == 2 && this.getDay() == 28) {
            nextDay = 29;
        }
        return new MyDate(nextYear, this.getMonth(), nextDay);
    }

    public MyDate previousDay() {
        int previousDay = this.getDay() - 1;
        int previousMonth = this.getMonth();
        int previousYear = this.getYear();

        if (isLeapYear(this.getYear()) && previousMonth == 3 && this.getDay() == 1) {
            previousYear = this.previousMonth().getYear();
            previousMonth = this.previousMonth().getMonth();
            previousDay = 29;
        }else if (this.getDay() == 1) {
            previousYear = this.previousMonth().getYear();
            previousMonth = this.previousMonth().getMonth();
            previousDay = DAYSINMONTHS[previousMonth - 1];
        }
        return new MyDate(previousYear,previousMonth,previousDay);
    }

    public MyDate previousMonth() {
        int previousMonth = this.getMonth() - 1;
        int previousYear = this.getYear();
        int previousDay = this.getDay();
        if (this.getMonth() == 1) {
            previousMonth = 12;
            previousYear = this.previousYear().getYear();
        }
        if (isLeapYear(this.getYear()) && previousMonth == 2 &&
                this.getDay() == DAYSINMONTHS[previousMonth - 1]) {
            previousDay = 29;
        }else if (this.getDay() == DAYSINMONTHS[this.getMonth() - 1]) {
            previousDay = DAYSINMONTHS[previousMonth - 1];
        }
        return new MyDate(previousYear, previousMonth, previousDay);
    }

    public MyDate previousYear() {
        int previoursYear = this.getYear() - 1;
        int previoursDay = this.getDay();
        if (isLeapYear(previoursYear) && this.getMonth() == 2 && this.getDay() == 28) {
            previoursDay = 29;
        }
        return new MyDate(previoursYear, this.getMonth(), previoursDay);
    }
}