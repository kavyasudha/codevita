import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class vowCons
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a alphabet");
    char  alpha=s.next().charAt(0);
    if((alpha>='a' && alpha<='z') || (alpha>='A' && alpha<='Z'))
    {
      if(alpha=='a'||alpha=='A'||alpha=='e'||alpha=='E'||alpha=='i'||alpha=='I'||alpha=='o'||alpha=='O'||alpha=='u'||alpha=='U')
          System.out.println("\nThe alphabet "   + alpha +    " is a vowel");
      else
          System.out.println("\nThe alphabet "   + alpha +   " is a consonant");
    }
    else
        System.out.println("It is not an alphabet");

  }
}
