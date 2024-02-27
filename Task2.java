import java.util.Scanner;

public class Task2
{
    private static int getNumber()
    {
        while (in.hasNextLine())
        {
            if (in.hasNextInt())
            {
                return in.nextInt();
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }

        return 0;
    }

    private static Scanner in;

    public static void call()
    {
        in = new Scanner(System.in);

        System.out.println("What is your birth month: ");
        int month = getNumber();

        if (month > 12 || month < 1)
        {
            System.out.println("Invalid month: " + month);
        }

        else {
            System.out.println("Valid month: " + month);
        }
    }
}
