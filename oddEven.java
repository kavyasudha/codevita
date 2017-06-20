import java.io.*;
import java.util.*;
import java.lang.*;
public class OddEven
{
  public static void main(String[] args)
  {
    int num;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    num=s.nextInt();
    if(num%2==0)
        System.out.println("\nEven Number");
    else
        System.out.println("\nOdd Number");
  }
}
