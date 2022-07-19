
import java.util.Scanner;



public class UserInput {
	public static void main(String[] args) {
		System.out.println("Taking Input from User");
		
	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter Number 1");
//	    int a = sc.nextInt();
//	    float a = sc.nextFloat();
//	    System.out.println("Enter Number 2");
//	    int b = sc.nextInt();
//	    float b = sc.nextFloat();
//	    float sum = a + b ;
//	    System.out.println("The Sum of these Number is ");
//	    System.out.println(sum);
	    
	    boolean b1 = sc.hasNextInt();
	    System.out.println(b1);
	}
}