import java.util.Scanner;

public class Task3
{
    private static String getString()
    {
        return in.nextLine();
    }

    private static Scanner in;

    public static void call()
    {
        in = new Scanner(System.in);

        System.out.println("What is your party? (D/R/I/O)");
        String str = getString();

        if (str.equals("D"))
        {
            System.out.println("You get a democratic donkey!");
        }

        else if (str.equals("R"))
        {
            System.out.println("You get a republican elephant");
        }

        else if (str.equals("I"))
        {
            System.out.println("You get an independent person!");
        }

        else {
            System.out.println("Other");
        }
    }
}
