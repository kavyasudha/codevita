import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class NoOfDigits
{
        public static void main(String[] args)
        {
          Scanner s=new Scanner(System.in);
          System.out.println("\n Enter a value : ");
          int num=s.nextInt();
          System.out.println("The Number of Digits in  " +num+ " are " +Integer.toString(num).length());
        }

}
