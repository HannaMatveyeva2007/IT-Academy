public class Task3 {
    public static void main(String[] args) {
        int time = 20;

        String greetings;

        if (time >= 6 && time < 12) {
            greetings = "Good morning!";
        } else if (time >= 12 && time < 18) {
            greetings = "Good afternoon!";
        } else if (time >= 18 && time < 24) {
            greetings = "Good evening!";
        } else if ((time >= 0 && time < 6) || time == 24) {
            greetings = "Good night!";
        } else {
            greetings = "Hi!";
        }
        System.out.println(greetings);
    }

}


