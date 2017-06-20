import java.util.*;
import java.util.Scanner;
import java.lang.*;
public class largNum
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a value : ");
    int first_num=s.nextInt();
    System.out.println("Enter a value : ");
    int second_num=s.nextInt();
    System.out.println("Enter a value : ");
    int third_num=s.nextInt();
    if(first_num > second_num)
    {
      if(first_num > third_num)
            System.out.println("\nThe Largest Number is " +first_num);
    }
    else if(second_num > third_num)
        System.out.println("\nThe Largest Number is " +second_num);
    else
        System.out.println("\nThe Largest Number is " +third_num);
  }
}
