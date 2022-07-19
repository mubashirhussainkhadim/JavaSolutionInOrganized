import java.util.Scanner;
public class Condiations {
       public static void main (String[] args) {
   		Scanner sc = new Scanner(System.in);
    	System.out.println("Please Enter Your AGE");
        int Age = sc.nextInt();
        
        if (Age > 18 && Age < 50) {
        	System.out.println("Yes you CAn Drive");
        }
        else {
        	System.out.println("No Boy NOT Yet!");
        }
       }
}
