public class Task2 {
    public static void main(String[] args) {
        int weekDayNumber = 3;

        String weekDayName;

        if (weekDayNumber == 1) {
            weekDayName = "Monday";
        } else if (weekDayNumber == 2) {
            weekDayName = "Tuesday";
        } else if (weekDayNumber == 3) {
            weekDayName = "Wednesday";
        } else if (weekDayNumber == 4) {
            weekDayName = "Thursday";
        } else if (weekDayNumber == 5) {
            weekDayName = "Friday";
        } else if (weekDayNumber == 6) {
            weekDayName = "Saturday";
        } else if (weekDayNumber == 7) {
            weekDayName = "Sunday";
        } else {
            weekDayName = "Uknown";
        }
        System.out.println(weekDayName);
    }


}
