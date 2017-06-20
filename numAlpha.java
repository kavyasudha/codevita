import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class numAlpha
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a character");
    char alpha=s.next().charAt(0);
    if((alpha>='a' && alpha<='z') || (alpha>='A' && alpha<='Z'))
          System.out.println("\n The character  " +alpha+ " is an alphabet");
    else
          System.out.println("\n The character " +alpha+ " is not an alphabet");
  }
}                             
