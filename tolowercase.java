import java.util.Scanner;
class tolowercase
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        String s2;
        s2=s.toLowerCase();
        System.out.println("String after converting to Lower case is "+s2);
    }
}
