import java.util.Scanner;
class arraysearch
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int t=sc.nextInt();
        int[] m= new int[t];
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter the "+(i+1)+" element of the array");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int n=sc.nextInt();
        int k=0;
        for(int i=0;i<t;i++)
        {
            if(m[i]==n)
            {
                k++;
              break;
            }
            
        }
        if(k!=0)
        System.out.println("Number found");
        else
        System.out.println("Number not found in the array");
    }
}