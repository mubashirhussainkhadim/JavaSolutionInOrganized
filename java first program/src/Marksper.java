import java.util.Scanner;



public class Marksper{
	public static void main(String[] args) {
		System.out.println("Total Marks of the Students");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Total Marks obtain of the Mathmatics");
        int m = sc.nextInt();
        System.out.println("Total Marks obtain of the Physics");
        int p = sc.nextInt();
        System.out.println("Total Marks obtain of the Computer");
        int c = sc.nextInt();
        System.out.println("Total Marks obtain of the Computer");
        int cm = sc.nextInt();
        System.out.println("Total Marks obtain of the Islamiyat");
        int Is = sc.nextInt();
        int TotalMarksObtain = m+p+c+cm+Is;
		System.out.println("Total Marks Obtain");
		System.out.println(TotalMarksObtain);
		float percentage = (TotalMarksObtain*100)/500; 
		System.out.println("percentage");
		System.out.println(percentage);
	}
}


