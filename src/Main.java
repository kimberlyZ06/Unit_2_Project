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
                Stories.story1();
            } else if (3 <= num || num <= 5) {
                System.out.println("The train is delayed :( You waited for 20 minutes and it's still not here." +
                        " You get to school late.");
                Stories.story1();
            } else if (num == 6){
                System.out.println("You got abducted by aliens!!");
                num = RollDie.rollDie();
                if (num == 1){
                    System.out.println("By some miracle you somehow escaped!");
                    Stories.story1();
                } else {
                    System.out.println("The aliens saw your attempt to escape and locked you in a cell.");
                    Stories.story2();
                }
            }
        } else {
            System.out.println("You made it to school with extra time to spare!");
            Stories.story1();
        }
        scan.close();

    }
}