import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class NaturalFormula
{
        public static void main(String[] args)
        {
          Scanner s=new Scanner(System.in);
          System.out.println("\n Enter the n value : ");
          int n=s.nextInt();
          System.out.println("\n The Sum Of First " +n+ " Natural numbers are " + (n*(n+1))/2);
         }
}
