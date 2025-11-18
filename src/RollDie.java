import java.util.Scanner;
public class RollDie{
    public static int rollDie(){
        Scanner scan = new Scanner(System.in);
        int num = (int) ((Math.random() * 6) + 1);
        System.out.println("Do you want to continue?");
        String response = scan.nextLine();
        response = response.toLowerCase();

        if (response.equals("yes")){
            System.out.println("Result: " + num);
            return num;
        } else {
            System.out.println("Too bad");
            System.out.println("Result: " + num);
            return num;
        }
    }

    public static void story1 (){
        int num = rollDie();
        Scanner scan = new Scanner(System.in);
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

        System.out.println("Yay! It's lunch time!");
        System.out.println("...");
        System.out.println("The line is very long :(");
        System.out.println("Do you want to line up?");
        String response = scan.nextLine();
        response = response.toLowerCase();

        if (response.equals("yes")) {

            int start = (int) (Math.random() * 50) + 1;
            while (start != 1) {
                int counter = start;
                start = (int) (Math.random() * counter) + 1;
                System.out.println("You're " + start + " place in line.");
            }
            System.out.println("You finally got your lunch!");
            System.out.println("I hope you enjoy it.");

        } else {
            System.out.println("You skipped lunch and you're hungry for the rest of the day.");
        }

        System.out.println("Finally it's the end of the school day!");
        System.out.println("It's time to head home!");
        num = RollDie.rollDie();
        if (num <= 4){
            System.out.println("Woohoo! The train is here! you got home with no problems.");
        } else {
            System.out.println("Turns out It started pouring :(");
            System.out.println("Your normal 30 minute commute turned to 3 hrs...");
        }

        System.out.println("After the long day, you just want to eat dinner and play games.");
        System.out.println("However, there's one thing you can't avoid");
        System.out.println("Studying and homework :(");

        System.out.println("Do you study and finish your homework?");
        num = RollDie.rollDie();
        if (num <= 3){
            System.out.println("You studied and finished your assignments.");
            System.out.println("Nothing much happens, but at least you're prepared :)");
        } else {
            System.out.println("You decided not to do your homework");
            num = RollDie.rollDie();
            if (num <= 2){
                System.out.println("Luckily for you your parents don't find out.");
            } else {
                System.out.println("Unfortunately, your parents found out and are pissed.");
            }
        }

        System.out.println("It is now 11pm. You should probably go to bed.");
        System.out.println("Do you?");
        num = RollDie.rollDie();
        if (num <= 2){
            System.out.println("Time for bed! You go to sleep and wakes up with a good night's of rest.");
        } else {
            System.out.println("You decided to play games all might and went to bed at 3 in the morning.");
        }

        System.out.println("The end.");
    }
}
