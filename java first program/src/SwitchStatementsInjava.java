import java.util.Scanner;
public class SwitchStatementsInjava {
    
	public static void main(String[] args) {
//		int age = 56;
		System.out.println("Enter U Age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		switch(age){
		case 18:
			System.out.println("Your AGE IS GRATER THAN 18 YOU DRIVE");
			break;
		case 50:
			System.out.println("Your age is greater 50 plz take rest you cannot drive");
			break;
		case 17:
			System.out.println("Your Age is les than 18 u cannot drive ");
			break;
		
		default :
			System.out.println("Enoy uour Life");
		
	}}
}
