package dayOne;

import java.util.Scanner;
public class GreatestNumber {

    
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
   
  System.out.print("Input the 1st number: ");
  int num1 = scan.nextInt();
   
  System.out.print("Input the 2nd number: ");
  int num2 = scan.nextInt();
   
  System.out.print("Input the 3rd number: ");
  int num3 = scan.nextInt();
   
   
  if (num1 > num2)
   if (num1 > num3)
    System.out.println("The greatest: " + num1);
   
  if (num2 > num1)
   if (num2 > num3)
    System.out.println("The greatest: " + num2);
   
  if (num3 > num1)
   if (num3 > num2)
    System.out.println("The greatest: " + num3);
 }
}