import java.util.Scanner;
class replace_space
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string, preferable a phrase or a sentence with space in them");
        String s=sc.nextLine();
        String p=s.replace(" ","_");
        System.out.println(p);
    }
}
