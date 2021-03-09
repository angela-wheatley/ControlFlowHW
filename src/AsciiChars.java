
public class AsciiChars
{

    public static void printNumbers()
    {
        for(char i = 48; i < 58; i++)
        {
            System.out.print(i);
        }
    }

    public static void printLowerCase()
    {
        System.out.print("\n");
        for(char i = 97; i < 123; i++)
        {
            System.out.print(i);
        }
    }

    public static void printUpperCase()
    {
        System.out.print("\n");
        for(char i = 65; i < 91; i++)
        {
            System.out.print(i);
        }
    }

    public static void main(String[] args)
    {
        printNumbers();
        printLowerCase();
        printUpperCase();
    }

}
