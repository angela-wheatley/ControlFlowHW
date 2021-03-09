import java.util.Scanner;
import java.util.Random;

public class PowerballNumbers
{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = userInput.next();
        System.out.printf("Hello %s\n", name);

        System.out.print("Do you wish to continue to the interactive portion? ");
        String response = userInput.next();

        if(response.equals("yes") || response.equals("y"))
        {

        }
        else
        {
            System.out.print("Please return later to complete the survey.");
            return;
        }

        int i;
        int magicBall;
        int pwrBall1;
        int pwrBall2;
        int pwrBall3;
        int pwrBall4;
        int pwrBall5;

        while(response.equals("yes") || response.equals("y"))
        {

            System.out.print("What is the name of your favorite pet? ");
            String petName = userInput.next();

            System.out.print("What is the age of your favorite pet? ");
            Integer petAge = Integer.parseInt(userInput.next());

            System.out.print("What is your lucky number? ");
            Integer luckyNum = Integer.parseInt(userInput.next());

            System.out.print("Do you have a favorite quarterback? (yes, no): ");
            String quarterback = userInput.next();

            Integer jerseyNum = null;
            if(quarterback.equals("yes"))
            {
                System.out.print("What is their jersey number? ");
                jerseyNum = Integer.parseInt(userInput.next());
            }

            System.out.print("What is the 2-digit model year of your car? ");
            Integer carYear = Integer.parseInt(userInput.next());

            System.out.print("What is the first name of your favorite actor or actress? ");
            String actorActress = userInput.next();

            System.out.print("Enter a random number between 1 and 50: ");
            Integer randomNum = Integer.parseInt(userInput.next());

            Random rand = new Random();
            int upperbound = 51;
            int random1 = rand.nextInt(upperbound);
            int random2 = rand.nextInt(upperbound);
            int random3 = rand.nextInt(upperbound);

            if(quarterback.equals("yes"))
            {
                magicBall = jerseyNum * randomNum;
            }
            else
            {
                magicBall = luckyNum * randomNum;
            }
            while(magicBall > 75)
            {
                magicBall -= 75;
            }
            while(magicBall <= 0)
            {
                magicBall += 75;
            }

            pwrBall1 = carYear + luckyNum;
            while(pwrBall1 > 65)
            {
                pwrBall1 -= 65;
            }
            while(pwrBall1 <= 0)
            {
                pwrBall1 += 65;
            }

            pwrBall2 = randomNum - random2;
            while(pwrBall2 > 65)
            {
                pwrBall2 -= 65;
            }
            while(pwrBall2 <= 0)
            {
                pwrBall2 += 65;
            }

            pwrBall3 = petName.charAt(2);
            while(pwrBall3 > 65)
            {
                pwrBall3 -= 65;
            }
            while(pwrBall3 <= 0)
            {
                pwrBall3 += 65;
            }

            pwrBall4 = actorActress.charAt(0);
            while(pwrBall4 > 65)
            {
                pwrBall4 -= 65;
            }
            while(pwrBall4 <= 0)
            {
                pwrBall4 += 65;
            }

            if(jerseyNum != null)
            {
                pwrBall5 = jerseyNum + petAge + luckyNum;
            }
            else
            {
                pwrBall5 = 42;
            }
            while(pwrBall5 > 65)
            {
                pwrBall5 -= 65;
            }
            while(pwrBall5 <= 0)
            {
                pwrBall5 += 65;
            }

            System.out.print("Lottery numbers: " + pwrBall1 + ", " + pwrBall2 + ", " + pwrBall3 + ", " + pwrBall4 + ", " + pwrBall5 + " Magic ball: " + magicBall);

            System.out.print("\nWould you like to generate another set of numbers? ");
            String response2 = userInput.next();
            if(response2.equals("no"))
            {
                System.out.print("Thanks for playing!");
                return;
            }
        }
    }

}
