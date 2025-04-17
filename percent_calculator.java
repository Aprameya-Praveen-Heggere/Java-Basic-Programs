import java.util.Scanner;
class percent_calculator
{
    public static void main()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of subjects");
      int j=sc.nextInt();
      double[] m=new double[j];
      double sum=0;
      for(int i=0;i<j;i++)
      {
          System.out.println("enter marks of subject"+" "+(i+1));
          m[i]=sc.nextDouble();
          sum+=m[i];
      }
      double percent=sum/j;
      System.out.println("Percentage = "+percent);
    }
}