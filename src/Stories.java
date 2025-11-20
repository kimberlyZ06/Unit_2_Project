import java.util.Scanner;
public class Stories {

        // going to school
        public static void story1 (){
        int num = RollDie.rollDie();
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
            System.out.println("Woohoo! The train is here! You got home with no problems.");
        } else {
            System.out.println("Turns out It started pouring :(");
            System.out.println("Your normal 30 minute commute turned to 3 hrs...");
        }

        System.out.println("After the long day, you just want to eat dinner and play games.");
        System.out.println("However, there's one thing you can't avoid");
        System.out.println("Studying and homework :(");

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
        num = RollDie.rollDie();
        if (num <= 2){
            System.out.println("Time for bed! You go to sleep and wakes up with a good night's of rest.");
        } else {
            System.out.println("You decided to play games all might and went to bed at 3 in the morning.");
        }

        System.out.println("The end.");
    }

    public static void story2 (){
        System.out.println("You have a choice of giving up or trying to escape again.");
        int num = RollDie.rollDie();
        if (num <= 3){
            System.out.println("You give up believing you can't escape");
            System.out.println("You die on the spaceship never to be seen again.");
            System.out.println("The end");
        } else {
            System.out.println("You decided it was better to try to escape again then sit and do nothing");
            System.out.println("After looking around a bit, you realize they use a keycard to stop the lasers trapping you.");
            System.out.println("You have a choice of trying to get the card or keep looking around.");
            num = RollDie.rollDie();
            if (num <= 3){
                System.out.println("You decided to stick your arm out and try pickpocketing an alien with the card");
                num = RollDie.rollDie();
                if (num <= 2){
                    System.out.println("You got the card and made it out of the UFO!");
                    System.out.println("Unfortunately, no one believed your story and you're forced back to school.");
                    story1();
                } else {
                    System.out.println("While you stuck your arm out, you accidentally touched a laser and it loped off your arm.");
                    System.out.println("Luckily, you won't bleed out but you lost all hope and accepted your fate.");
                    System.out.println("You end up dying on the ship");
                    System.out.println("The end");

                }
            } else {
                System.out.println("After looking around some more");
                System.out.println("You realized you weren't the first person trying to escape!");
                System.out.println("There are still things left from the previous person");
                System.out.println("You find first aid, a parachute, and a sandwich");
                System.out.println("You also realized a part of the wall is really thin");
                System.out.println("You broke the wall.");
                num = RollDie.rollDie();
                if (num <= 2){
                    System.out.println("Luckily, you're not in space yet");
                    System.out.println("You jumped out and used the parachute you found");
                    System.out.println("You survived but no one believes your story");
                    System.out.println("Your parents thought you were crazy and skipped school");
                } else {
                    System.out.println("Turns out you are in space.");
                    System.out.println("Your body isn't made for that and you die.");
                    System.out.println("Your remains end up floating in space until they were discovered years later.");
                    System.out.println("The end.");
                }
            }

        }

    }
}
