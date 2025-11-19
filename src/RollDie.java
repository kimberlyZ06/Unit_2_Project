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
}
