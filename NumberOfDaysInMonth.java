package java_masterclass;

public class NumberOfDaysInMonth {

    private static boolean isLeapYear(int year) {                                               
        if (year < 1 || year > 9999) {
            return false;
        } else return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;            // 判断是否为闰年
    }

    private static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        int daysInMonth = 0;
        switch (month) {


            case 1: case 3: case 5: case 7: case 8: case 10: case 12:                   // 一三五七八十腊，三十一天永不差；
                daysInMonth = 31;
                break;



            case 4: case 6: case 9: case 11:                                            // 四六九冬三十整，
                daysInMonth = 30;
                break;

            case 2:                                                                     // 惟有二月二十八，闰年还要把一日加
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
        }
        return daysInMonth;
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020));
    }
}
