import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("BEEP! BEEP! BEEP!");
        System.out.println("Do you wake up or press snooze? (<= 3 wake up, > 3 press snooze)");
        System.out.println(RollDie.rollDie());
        if (RollDie.rollDie() <= 3){
            System.out.println("Uh oh! you woke up late and missed the train! :(");
            RollDie.rollDie();
            if (RollDie.rollDie() <= 3){
                System.out.println("Lucky you! There's another train. You make it to school just in time!");
            } else {
                System.out.println("The train is delayed :(. You waited for 20 minutes and it's still not here." +
                        "You get to school late.");
            }
        } else {
            System.out.println("You made it to school with extra time to spare!");
        }

        scan.close();

    }
}