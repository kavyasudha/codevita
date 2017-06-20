import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class LeapYr
{
        public static void main(String[] args)
        {
                Scanner s=new Scanner(System.in);
                System.out.println("Enter a year");
                int year=s.nextInt();
                if(year%4==0&&year%100!=0)
                                System.out.println("\n The year "+year+ " is a leap year");
                else if(year%400==0)
                                 System.out.println("\n The year "+year+ " is a leap year");
                else
                                System.out.println("\n The year "+year+ " is not a leap year");
        }
}
