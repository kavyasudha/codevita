import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class findNum
{
  public static void main(String[] args)
   {
      int i;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number : ");
      i=s.nextInt();
      if(i>0)
        System.out.println("Positive Number");
      else if(i<0)
        System.out.println("Negative number");
      else
        System.out.println("The given number is zero");
    }
   }
