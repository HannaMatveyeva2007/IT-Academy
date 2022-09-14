public class Task4 {
    public static void main(String[] args) {
        int time = 6;

        String greetings;

        switch (time) {
            case 24:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                greetings = "Good night!";
                System.out.println(greetings);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                greetings = "Good morning!";
                System.out.println(greetings);
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                greetings = "Good afternoon!";
                System.out.println(greetings);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                greetings = "Good evening!";
                System.out.println(greetings);
                break;
            default:
                greetings = "Hi!";
                System.out.println(greetings);
        }

    }


}
