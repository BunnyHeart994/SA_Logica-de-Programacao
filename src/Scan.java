import java.util.Scanner;

public class Scan
{
    private static final Scanner scan = new Scanner(System.in);

    //Next 4 methods below prints text, scans input and returns method's type
    public static int integer(String text)
    {
        Print.print(text);
        return scan.nextInt();
    }
    public static double floatingPoint(String text)
    {
        Print.print(text);
        return scan.nextDouble();
    }
    public static String string(String text)
    {
        Print.print(text);
        return scan.nextLine();
    }
    public static char character(String text)
    {
        Print.print(text);
        return scan.nextLine().charAt(0);
    }

    //Next 4 overloaded methods below scan input and return method's type
    public static int integer()
    {
        return scan.nextInt();
    }
    public static double floatingPoint()
    {
        return scan.nextDouble();
    }
    public static String string()
    {
        return scan.nextLine();
    }
    public static char character()
    {
        return scan.nextLine().charAt(0);
    }
}
