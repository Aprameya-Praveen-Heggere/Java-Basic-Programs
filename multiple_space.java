import java.util.*;
class multiple_space
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string with many spaces in it");
        String s=sc.nextLine();
        int p=s.length();
        int k=0;
        for(int i=0;i<p;i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            k++;
        }
        System.out.println("The total number of spaces in the entered string is "+k);
    }
}