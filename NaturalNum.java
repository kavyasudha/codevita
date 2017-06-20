import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class NaturalNum
{
        public static void main(String[] args)
        {
          Scanner s=new Scanner(System.in);
          System.out.println("\n Enter a value : ");
          int range=s.nextInt();
          int sum=0;
          for(int i=1;i<=range;i++)
              sum+=i;
          System.out.println("\nThe Sum Of first "+range+" Natural Numbers are  "+sum);
        }
}
~                           
