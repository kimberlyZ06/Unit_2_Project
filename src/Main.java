import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("BEEP! BEEP! BEEP!");
        System.out.println("Do you wake up or press snooze?");
        int num = RollDie.rollDie();
        if (num <= 3){
            System.out.println("Uh oh! You woke up late and missed the train! :(");
            System.out.println("However there's still hope!");
            num = RollDie.rollDie();
            if (num <= 2){
                System.out.println("Lucky you! There's another train. You make it to school just in time!");
            } else {
                System.out.println("The train is delayed :( You waited for 20 minutes and it's still not here." +
                        " You get to school late.");
            }
        } else {
            System.out.println("You made it to school with extra time to spare!");
        }

        System.out.println("Regardless of when you made it to school, you have a test today!");
        System.out.println("Did you study?");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if (answer.equals("yes")){
            System.out.println("Lets see how you did!");
            num = RollDie.rollDie();
            if (num <= 3){
                System.out.println("Woohoo! You passed with flying colors!");
            } else {
                System.out.println("It's okay. You'll do better nexT time :)");
            }
        } else {
            System.out.println("Lets see how you did!");
            num = RollDie.rollDie();
            if (num <= 3){
                System.out.println("Woah! great job!");
            } else {
                System.out.println("Maybe you should study next time.");
            }
        }

        scan.close();

    }
}