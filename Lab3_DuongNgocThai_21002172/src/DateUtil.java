public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May",
            "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static int[] daysInMoths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapyear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (1 <= year && year <= 9999) {
            if (1 <= month && month <= 12) {
                if (month == 2 && isLeapyear(year) && day == 29) {
                    return true;
                }
                if (day == daysInMoths[month - 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDayOfweek(int year, int month, int day) {
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
        if (isLeapyear(year)) {
            key2 = monthTable[1][month - 1];
        }
        if (isLeapyear(year) == false) {
            key2 = monthTable[0][month - 1];
        }
        int output = (key1 + year % 100 + (year % 100) / 4 + key2 + day) % 7;
        return output;
    }

    public static String toString(int year, int month, int day) {
        String[] dayConvert = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        String dayOfWeek = dayConvert[getDayOfweek(year, month, day)];
        return dayOfWeek + " " + day + " " + month + " " + year;
    }

    public static void main(String[] args) {
        System.out.println(isLeapyear(1900));
        System.out.println(isLeapyear(2000));
        System.out.println(isLeapyear(2011));
        System.out.println(isLeapyear(2012));
        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
    }
}
