import java.net.SocketOption;

public class Task1 {
    public static void main(String[] args) {
        int weekDayNumber = 5;

        String weekDayName;

        switch (weekDayNumber) {
            case 1:
                weekDayName = "Monday";
                break;
            case 2:
                weekDayName = "Tuesday";
                break;
            case 3:
                weekDayName="Wednesday";
                break;
            case 4:
                weekDayName="Thursday";
                break;
            case 5:
                weekDayName="Friday";
                break;
            case 6:
                weekDayName="Saturday";
                break;
            case 7:
                weekDayName="Sunday";
                break;
            default:
                weekDayName="Unknown";
                break;
        }
        System.out.println(weekDayName);
    }
}
