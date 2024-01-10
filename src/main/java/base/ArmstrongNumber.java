package base;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		   int n ;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter number : ");
		  int armstrongNum =  sc.nextInt();
		  
		  System.out.println("Result: " + armstrongNum);
		  String intStr = Integer.toString(armstrongNum);
		  
		  for (int i=0; i<intStr.length(); i++) {
			  System.out.println(intStr.charAt(i));
			  char value = intStr.charAt(i);
			  int newValue = value;
			  System.out.println(newValue);
		  }

	}

}
