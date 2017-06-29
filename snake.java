import java.util.Scanner;
import java.io.*;
import java.lang.*;
class snakeGame
{
 public static void main(String [] args)
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int i,j;
  for(i=0;i<a;i++)
  {
   if(i==0||i==a-1)
    for(int k=0;k<a;k++)
      System.out.print("* ");
   else
   {
    for(j=0;j<a;j++)
    {
      if(j==0||j==a-1)
       System.out.print("* ");
      else
       System.out.print("  ");
    }
    
   }
   System.out.println();
  }
 }
}
