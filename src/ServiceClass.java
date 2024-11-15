import java.util.Random;
import java.util.Scanner;

public class ServiceClass implements CinemaInterface {

    static String movie[] = {"Movies:", "1.JOKER", "2.FAST AND FURIOUS : HOBBS & SHAW", "3.SKYSCRAPER"};

    static String time[] = {"Time:", "1. 17:00", "2. 18:50", "3. 20:30"};

    static Random rand = new Random();

    static Scanner sc = new Scanner(System.in);


    @Override
    public void menu() {
        System.out.println("Welcome to Cinema Service !");
        System.out.println();
        System.out.println("1.What's available for today?");
        System.out.println("2.Quit the application.");
        System.out.println("Your choice: ");
    }

    @Override
    public void list() {
        System.out.println("Please note that all of the movies are available to watch in ");

        for (int i = 0; i < time.length; i++) {
            System.out.println(time[i]);}
        System.out.println();



        for (int b = 0; b < movie.length; b++) {
            System.out.println(movie[b]);}

            System.out.println("Your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Please enter the time :");
                int clock = sc.nextInt();
                if (clock == 1) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);


                }
                else if (clock == 2) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);
                }
                else if (clock == 3) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);
                }
            }
            else if (choice == 2) {
                System.out.println("Please enter the time :");
                int clock = sc.nextInt();
                if (clock == 1) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);

                }
                else if (clock == 2) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);

                }
                else if (clock == 3) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);

                }
            }
            else if (choice == 3) {
                System.out.println("Please enter the time :");
                int clock = sc.nextInt();
                if (clock == 1) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);

                }
                else if (clock == 2) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);
                }
                else if (clock == 3) {
                    System.out.println("Congratulations! You booked for the movie " + movie[choice] + " at " + time[clock]);
                    System.out.println("ROW : " + rand.nextInt(1,12));
                    System.out.println("PLACE : " + rand.nextInt(1,20));
                    System.exit(0);
                }
            }








    }

    @Override
    public void quit() {
        System.out.println("GOODBYE!");
        System.exit(0);
    }
}