
public class Logical {
   public static void main(String[] args) {
	   System.out.println("for Logical And......");
	   
	   boolean a = false;
	   boolean b = false;
	   boolean c = true;
	   if (a && b && c) {
		   System.out.println("y");
	   } else {
		   System.out.println("N");
	   }
       System.out.println("for Logical Or......");
	   
        if (a || b || c) {
		   System.out.println("y");
	   } else {
		   System.out.println("N");
	   }
	   
        System.out.println("for Logical Not......");
 	   
        System.out.print("Note A is:");
        System.out.println(!a);
        System.out.print("Note B is:");
        System.out.println(!b);

	   
   }
}
